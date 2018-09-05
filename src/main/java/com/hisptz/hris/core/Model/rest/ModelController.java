package com.hisptz.hris.core.Model.rest;

import com.hisptz.hris.Bundles.FormSectionBundle.FormSection;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReport;
import com.hisptz.hris.Bundles.RecordBundle.Record;
import com.hisptz.hris.core.Model.common.ModelQueries;
import com.hisptz.hris.core.Model.main.Model;
import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelRepositories;
import com.hisptz.hris.core.QueryStructure.ApiQuery;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by Guest on 8/29/18.
 */
@Component
@RestController
@RequestMapping("/api")
public class ModelController<T extends Model> extends ModelQueries {

    @GetMapping("")
    public Page<Map<String, String>> get(@RequestParam(required = false) String model, @RequestParam(required = false) String fields, @RequestParam(required = false) String filters, @RequestParam(required = false) String sort, @RequestParam(required = false) Integer size, @RequestParam(required = false) Integer page){
        ApiQuery query = createQuery(model,fields,filters);
        List<Map<String, String>> results = perfomQuery(query.toString(), query);

        if (size == null || size <= 0){
            size = results.size() ;
        }

        if (page == null){
            page = 0;
        }

        Pageable pageRequest = createPageRequest(page,size, sort);
        int start = size*(page + 1) - size;
        int end = size*(page+1) < results.size() ? size*(page+1) : results.size();

        Page<Map<String, String>> thisPage = new PageImpl<>(results.subList(start, end), pageRequest, results.size());

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

       PageRequest pageRequest = new PageRequest(page, size, Sort.Direction.DESC, "id");
        return pageRequest;
    }

    public List<Map<String, String>> perfomQuery(String graphqlQuery, ApiQuery query){
        JSONObject myResponse = new JSONObject();
        String query_url = "http://localhost:8080/graphql";
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
            e.printStackTrace();
        }
        //return myResponse;
        //return data;
        return lists;
    }

    // Page performQuery(String query, String requestType)
    // localhost:8080/api/users.json?fields=id,name&filters=name:eq:Vincent;AND;id:in:[wyte,wyeiw]
    // curl --header "Content-Type:application/json" --request POST --data '{"query":"{Users{id}}"}' http://localhost:8080/graphql
}
