package com.hisptz.hris.core.rest.QueryStructure;

import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Guest on 9/3/18.
 */
public class ApiQuery extends ApiOperation{
    // localhost:8080/api/users.json?fields=id,name&filters=name:eq:Vincent;AND;id:in:[wyte,wyeiw]
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

    //TODO: Implement complex queries
    //TODO: Implement sorting into the rest api
    //TODO: Immplement security and authentication into the app
}
