package com.hisptz.hris.core.rest.QueryStructure;

/**
 * Created by Guest on 8/17/18.
 */

public class QueryCriteria {
    /**
     *  A Model of a query string that the API user will input as an argument of the GraphQl Query
     */
    private String key;
    private String operation;
    private String value;

    public QueryCriteria(String key, String operation, String value) {
        this.key = key;
        this.operation = operation;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Column name: "+ key + " Relation Filter: "+ operation + " Value "+ value;
    }
}
