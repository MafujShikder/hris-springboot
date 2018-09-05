package com.hisptz.hris.core.QueryStructure;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Guest on 9/3/18.
 */
public class ApiQuery {
    // localhost:8080/api/users.json?fields=id,name&filters=name:eq:Vincent;AND;id:in:[wyte,wyeiw]
    private String model;
    private List<String> fields;
    private String filters;
    private String sort;

    public ApiQuery(String model, List<String> fields, String filters,String sort) {
        this.model = StringUtils.capitalize(model);
        this.fields = fields;
        this.filters = filters;
        this.sort = sort;
    }

    public ApiQuery(String model, String filters) {
        this.model = StringUtils.capitalize(model);
        this.filters = filters;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
    //'{"query":"{Users(where:\"id:eq:3\"){id uid}}"}'
    //"{\"query\":\"{Users(where:\\\"id:eq:3\\\"){id uid}}\"}"

    // what about complex queries ?
    @Override
    public String toString() {

        String thisString = "{\"query\":\"" + "{"+ model  ;

        if (filters != null ){
            thisString += "(where:\\\"" + filters + "\\\")" ;
        }

        thisString +=  "{";

        for (String field: fields) {
            thisString = thisString + field + " ";
        }
        thisString = thisString  +"}" +
                "}" + "\"}";

        return thisString;
    }
}
