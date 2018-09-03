package com.hisptz.hris.core.Model.rest;

import com.hisptz.hris.Bundles.FormSectionBundle.FormSection;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReport;
import com.hisptz.hris.Bundles.RecordBundle.Record;
import com.hisptz.hris.core.Model.common.ModelQueries;
import com.hisptz.hris.core.Model.main.Model;
import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelRepositories;
import com.hisptz.hris.core.QueryStructure.ApiQuery;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Guest on 8/29/18.
 */
@Component
@RestController
@RequestMapping("/api")
public class ModelController<T extends Model> extends ModelQueries {
    ModelQuery<T> modelQuery;

    public Page<T> makePage( List<T> objects){
        Page<T> page = new PageImpl<T>(objects);
        return page;
    }

    @GetMapping("")
    public String get(@RequestParam(required = false) String model, @RequestParam(required = false) String fields, @RequestParam(required = false) String filters){
        ApiQuery query = createQuery(model,fields,filters);
       return perfomQuery(query.toString()).toString();
       // System.out.println(query.toString());
       // return new ArrayList<T>();
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

    public JSONObject perfomQuery(String graphqlQuery){
        JSONObject myResponse = new JSONObject();
        String query_url = "http://localhost:8080/graphql";

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
            System.out.println(result);
            System.out.println("result after Reading JSON Response");
            myResponse = new JSONObject(result);


            return myResponse;
        } catch (Exception e){
            e.printStackTrace();
        }
        return myResponse;
    }

    // Page performQuery(String query, String requestType)
    // localhost:8080/api/users.json?fields=id,name&filters=name:eq:Vincent;AND;id:in:[wyte,wyeiw]
    // curl --header "Content-Type:application/json" --request POST --data '{"query":"{Users{id}}"}' http://localhost:8080/graphql
}
