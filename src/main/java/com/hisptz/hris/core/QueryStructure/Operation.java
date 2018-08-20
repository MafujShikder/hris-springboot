package com.hisptz.hris.core.QueryStructure;

/**
 * Created by Guest on 8/20/18.
 */
public enum Operation {
    EQ("eq"),
    ILIKE("ilike");

    private String op;

    Operation(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }
}
