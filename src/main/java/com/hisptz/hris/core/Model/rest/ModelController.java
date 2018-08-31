package com.hisptz.hris.core.Model.rest;

import com.hisptz.hris.Bundles.FormSectionBundle.FormSection;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReport;
import com.hisptz.hris.Bundles.RecordBundle.Record;
import com.hisptz.hris.core.Model.common.ModelQueries;
import com.hisptz.hris.core.Model.main.Model;
import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelRepositories;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sun.deploy.util.SessionState;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
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
@RequestMapping("/")
public class ModelController<T extends Model> extends ModelQueries {
    ModelQuery<T> modelQuery;

    public Page<T> makePage( List<T> objects){
        Page<T> page = new PageImpl<T>(objects);
        return page;
    }

    @GetMapping("this")
    public List<T> get(@RequestParam(required = false) String query){
        perfomQuery();
        return new ArrayList<T>();
    }
    // use java jax-rs api to consume graphql api

    public void perfomQuery(){

        try {
            Unirest.post("http://localhost:8080/graphql")
                    .queryString("query", "{Users{id uid}}").asJson();
        } catch (UnirestException e){
            e.printStackTrace();
        }
    }

    @PostMapping("this")
    public List<T> create(@RequestParam(required = false) String query){
        perfomQuery();
        return new ArrayList<T>();
    }

    @PutMapping("this")
    public List<T> update(@RequestParam(required = false) String query){
        perfomQuery();
        return new ArrayList<T>();
    }

    @DeleteMapping("this")
    public List<T> delete(@RequestParam(required = false) String query){
        perfomQuery();
        return new ArrayList<T>();
    }

    // Page performQuery(String query, String requestType)
    // localhost:8080/api/users.json?fields=id,name&filters=name:eq:Vincent;AND;id:in:[wyte,wyeiw]
    // curl --header "Content-Type:application/json" --request POST --data '{"query":"{Users{id}}"}' http://localhost:8080/graphql
}
