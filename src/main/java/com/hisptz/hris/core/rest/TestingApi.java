package com.hisptz.hris.core.rest;


import com.hisptz.hris.core.rest.QueryStructure.ApiQuery;

import java.util.ArrayList;
import java.util.List;

public class TestingApi {
    String url = "http://localhost:8080/Users";

    public static void main(String args[]){
       // System.out.print("{\"query\":\"{Users(where:\\\"id:eq:3\\\"){id uid}}\"}");
        ApiQuery query = new ApiQuery("users", "id:ilike:1");
        List<String> fields = new ArrayList<>();
        fields.add("id");
        query.setFields(fields);

        String thisString = "{\"query\":\"" + "{"+ query.getModel() +"(where:\\\"" +query.getFilters() + "\\\")"+ "{" ;
        for (String field: query.getFields()) {
            thisString = thisString + field + " ";
        }
        thisString = thisString  +"}" +
                "}" + "\"}";
        System.out.println(thisString);
    }

}

