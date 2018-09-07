package com.hisptz.hris.core.Model.rest.Controllers;

import com.hisptz.hris.core.Model.rest.ErrorHandling.Error;
import com.hisptz.hris.core.Model.rest.ErrorHandling.HttpStatus;
import com.hisptz.hris.core.Model.rest.ErrorHandling.HttpStatusCode;
import com.hisptz.hris.core.Model.rest.ErrorHandling.Status;
import com.hisptz.hris.core.QueryStructure.ApiQuery;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
public class ApiDataController {
    private ApiQuery query;
    private List<Map<String, String>> results;
    private Page<Map<String, String>> thisPage;
    private Pageable pageRequest;
    private List<Map<String, String>> errors = new ArrayList<>();
    private Error error;
    private int start;
    private int end;

    @GetMapping("")
    public Page<Map<String, String>> get(@RequestParam String model, @RequestParam(required = false) String fields, @RequestParam(required = false) String filters, @RequestParam(required = false) String sort, @RequestParam(required = false) Integer size, @RequestParam(required = false) Integer page){
        query = createQuery(model,fields,filters);
        results = perfomQuery(query.toString(), query);

        if (errors != null && errors.containsAll(results)){
            List<Map<String, String>> temp = new ArrayList<>();
            temp.addAll(errors);
            errors.clear();
            return new PageImpl<>(temp);
        }

        if (size == null || size <= 0 || size > results.size()){
            size = results.size() ;
        }

        if (page == null){
            page = 0;
        }

        if (results.size() == 0){
            size = 2;
        }
        pageRequest = createPageRequest(page,size, sort);

        start = size*(page + 1) - size;
        end = size*(page+1) < results.size() ? size*(page+1) : results.size();

        // sort the data here
        thisPage = new PageImpl<>(results.subList(start, end), pageRequest, results.size());

        return thisPage;
    }

    private ApiQuery createQuery(String model, String fields, String filters){
        ApiQuery query = new ApiQuery(model,filters);
        List<String> fieldsList  = new ArrayList<>();
        String[] myfields;

        if (fields != null) {
            myfields = fields.split(",");

            for (String field : myfields) {
                fieldsList.add(field);
            }
        }

        query.setFields(fieldsList);

        return query;
    }

    private  Pageable createPageRequest(int page, int size, String sort) {
        pageRequest = new PageRequest(page, size, Sort.Direction.DESC, "id");
        return pageRequest;
    }

    public List<Map<String, String>> perfomQuery(String graphqlQuery, ApiQuery query){
        JSONObject myResponse = new JSONObject();
        String query_url = "http://localhost:8080/graphql";
        String errorMessage = "";
        Data data = new Data();
        List<String> fields = query.getFields();
        List<Map<String, String>> lists = new ArrayList<>();


        try {
            URL url = new URL(query_url);
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
            String result = IOUtils.toString(in, "UTF-8");
//            System.out.println(result);
//            System.out.println("result after Reading JSON Response");
            myResponse = new JSONObject(result);

            data.model = query.getModel();

            JSONArray mainData = myResponse.getJSONObject("data").getJSONArray(query.getModel());

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

            data.setColumns(lists);
            //return myResponse;
            //return data;
            return lists;
        } catch (Exception e){
            //e.printStackTrace();
            try {
                JSONObject errorData = myResponse.getJSONObject("errors");

                errorMessage = errorData.getString("message");
            } catch (JSONException e1){

            }
            error = new Error(HttpStatus.ERROR, e.getLocalizedMessage(), HttpStatusCode.HTTP_STATUS_CODE_403, Status.ERROR);
            errors.add(error.getErrorMap());
        }
        //return myResponse;
        //return data;
        return lists;
    }

    // Page performQuery(String query, String requestType)
    // localhost:8080/api/users.json?fields=id,name&filters=name:eq:Vincent;AND;id:in:[wyte,wyeiw]
    // curl --header "Content-Type:application/json" --request POST --data '{"query":"{Users{id}}"}' http://localhost:8080/graphql
}
