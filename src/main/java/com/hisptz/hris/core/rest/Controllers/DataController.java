package com.hisptz.hris.core.rest.Controllers;

import com.hisptz.hris.core.rest.ErrorHandling.Error;
import com.hisptz.hris.core.rest.ErrorHandling.HttpStatus;
import com.hisptz.hris.core.rest.ErrorHandling.HttpStatusCode;
import com.hisptz.hris.core.rest.ErrorHandling.Status;
import com.hisptz.hris.core.rest.QueryStructure.ApiMutation;
import com.hisptz.hris.core.rest.QueryStructure.ApiOperation;
import com.hisptz.hris.core.rest.QueryStructure.ApiQuery;
import com.hisptz.hris.core.rest.QueryStructure.MutationType;
import com.sun.xml.internal.bind.v2.TODO;
import graphql.GraphQL;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * Created by Guest on 8/29/18.
 */
@Component
@RestController
@RequestMapping("/api")
public class DataController {
    private ApiQuery query;
    private List<Map<String, String>> results;
    private Page<Map<String, String>> thisPage;
    private Pageable pageRequest;
    private List<Map<String, String>> errors = new ArrayList<>();
    private final String QUERY_URL = "http://localhost:8080/graphql";
    private Error error;
    private int start;
    private int end;

    @GetMapping("{model}.json")
    public Page<Map<String, String>> get(@PathVariable("model") String model, @RequestParam(required = false) String fields, @RequestParam(required = false) String filters, @RequestParam(required = false) String sort, @RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer page){
        if (fields == null || fields.trim().equalsIgnoreCase("")){
            fields = "id,uid";
        }

        query = createQuery(model,fields,filters);
        results = perfomOperation(query.toString(), query);

        if (errors != null && errors.containsAll(results)){
            List<Map<String, String>> temp = new ArrayList<>();
            temp.addAll(errors);
            errors.clear();
            return new PageImpl<>(temp);
        }

        if (pageSize == null || pageSize <= 0 || pageSize > results.size()){
            pageSize = results.size() ;
        }

        if (page == null){
            page = 0;
        }

        if (results.size() == 0){
            pageSize = 2;
        }
        pageRequest = createPageRequest(page,pageSize, sort);

        start = pageSize*(page + 1) - pageSize;
        end = pageSize*(page+1) < results.size() ? pageSize*(page+1) : results.size();

        // sort the data here
        thisPage = new PageImpl<>(results.subList(start, end), pageRequest, results.size());

        return thisPage;
    }


    @PostMapping("{model}.json")
    public List<Map<String, String>> create(@PathVariable("model") String model, @RequestBody String body){
        return performMutation(model, body, MutationType.CREATE);
    }

    @PutMapping("{model}.json")
    public List<Map<String, String>> update(@PathVariable("model") String model,@RequestBody String body, @RequestParam(required = false) String fields, @RequestParam(required = false) String filters, @RequestParam(required = false) String sort, @RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer page){
        return performMutation(model, body, MutationType.UPDATE);
    }

    @DeleteMapping("{model}.json")
    public List<Map<String, String>> delete(@PathVariable("model") String model, @RequestBody String body){
        return performMutation(model, body, MutationType.DELETE);
    }


    private ApiQuery createQuery(String model, String fields, String filters){
        ApiQuery query = new ApiQuery(model,filters);
        List<String> fieldsList  = new ArrayList<>();
        String[] myfields;

        if (fields != null) {
            myfields = fields.split(",");

            for (String field : myfields) {
                fieldsList.add(field.trim());
            }
        }

        query.setFields(fieldsList);

        return query;
    }

    private  Pageable createPageRequest(int page, int size, String sort) {
        pageRequest = new PageRequest(page, size, Sort.Direction.DESC, "id");
        return pageRequest;
    }

    public List<Map<String, String>> perfomOperation(String graphqlQuery, ApiOperation operation){
        JSONObject myResponse = new JSONObject();
        List<String> fields = operation.getFields();
        List<Map<String, String>> lists = new ArrayList<>();


        try {
            myResponse = connectToResourse(graphqlQuery);


            JSONArray mainData = myResponse.getJSONObject("data").getJSONArray(operation.getModel());

            List<JSONObject> objs = new ArrayList<>();
            for (int i = 0; i < mainData.length(); i++) {
                if (mainData.getJSONObject(i) != null)
                    objs.add(mainData.getJSONObject(i));
            }


            for (JSONObject jsonList: objs) {
                Map<String, String> eachList = new HashMap<>();
                for (String field: fields){
                    eachList.put(field, jsonList.getString(field));
                }
                lists.add(eachList);
            }

            //return myResponse;
            //return data;
            System.out.println(lists);
            return lists;
        } catch (Exception e){
//            error = new Error(HttpStatus.ERROR, "The model "+ operation.getModel() +" doesn't exist in the schema. Please check the schema definition", HttpStatusCode.HTTP_STATUS_CODE_403, Status.ERROR);
//            errors.add(error.getErrorMap());
            e.printStackTrace();
            errors.add(new Error(HttpStatus.ERROR, e.getLocalizedMessage(), HttpStatusCode.HTTP_STATUS_CODE_403, Status.ERROR).getErrorMap());
        }
        //return myResponse;
        //return data;
        return lists;
    }

    public JSONObject connectToResourse(String graphqlQuery){
        String result = "";
        JSONObject object = new JSONObject();
        try {
            URL url = new URL(QUERY_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            OutputStream os = conn.getOutputStream();
            os.write(graphqlQuery.getBytes("UTF-8"));
            os.close();


            // read the response
            InputStream in = new BufferedInputStream(conn.getInputStream());
            result = IOUtils.toString(in, "UTF-8");
            object = new JSONObject(result);
        } catch (Exception e){
            error = new Error(HttpStatus.ERROR, e.getLocalizedMessage(), HttpStatusCode.HTTP_STATUS_CODE_403, Status.ERROR);
            errors.add(error.getErrorMap());
        }
        return object;
    }


    public ApiMutation createMutation(String model, String body, MutationType mutationType){
        ApiMutation mutation = new ApiMutation(model, mutationType);

        List<String> fields = new ArrayList<>();
        List<Object> values = new ArrayList<>();
        JSONObject object = new JSONObject();

        try {
            object  = new JSONObject(body);
        } catch (JSONException e){
            e.printStackTrace();
        }


        JSONArray names = object.names();
        try {
            for (int i = 0; i < names.length(); i++) {
                fields.add(names.getString(i).trim());
                values.add(object.get(names.getString(i).trim()));
            }
        } catch (JSONException e){
            e.printStackTrace();
            errors.add(new Error(HttpStatus.ERROR, e.getLocalizedMessage(), HttpStatusCode.HTTP_STATUS_CODE_403, Status.ERROR).getErrorMap());
        }

        mutation.setFields(fields);
        mutation.setValues(values);

        System.out.println(mutation.toString());

        return mutation;
    }

    public List<Map<String, String>> performMutation(String model, String body, MutationType mutationType){
        ApiMutation mutation = createMutation(model, body, mutationType);

        //calling graphql
        errors.clear();
       // results = perfomOperation(mutation.toString(), mutation);
        results = sendMutationToGraphql(mutation.toString(), mutation);

        if (errors != null && errors.containsAll(results)){
            results.addAll(errors);
            errors.clear();
        }

        return results;
    }
    public List<Map<String, String>> sendMutationToGraphql(String graphqlQuery, ApiMutation mutation){
        JSONObject myResponse = new JSONObject();
        List<String> fields = mutation.getFields();
        List<Map<String, String>> lists = new ArrayList<>();


        try {
            myResponse = connectToResourse(graphqlQuery);

            JSONObject resultsObject = myResponse.getJSONObject("data");

            String key = "";
            System.out.println(resultsObject);

            if (mutation.getMutationType() == MutationType.DELETE) {
                 key = "delete" + mutation.getModel();
                Map<String, String> resultsMap = new HashMap<>();
                resultsMap.put(key, resultsObject.getString(key));
                lists.add(resultsMap);
                return lists;
            } else if (mutation.getMutationType() == MutationType.CREATE){
                key = "new" + mutation.getModel();
            } else if (mutation.getMutationType() == MutationType.UPDATE){
                key = "new" + mutation.getModel();
            }
            resultsObject = resultsObject.getJSONObject(key);
            JSONArray mainData = resultsObject.names();

            for (int i = 0; i < mainData.length(); i++){
                Map<String, String> resultsMap = new HashMap<>();
                resultsMap.put(mainData.getString(i), (String)resultsObject.get(mainData.getString(i)));
                lists.add(resultsMap);
            }
            System.out.println(mainData);
            return lists;
        } catch (Exception e){
           e.printStackTrace();
        }

        return lists;
    }

    
    // TODO: Implement sorting using pageable
    // TODO: Use graphql introspection to allow for return all columns upon * in the fields parameter
    // TODO: Redo the documentation
    // TODO: Clean up the schema
    // TODO: Submit the assignment
}
