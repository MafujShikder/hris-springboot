package com.hisptz.hris.core.rest.QueryStructure;

/**
 * Created by Guest on 8/20/18.
 */
public enum Operator {
    EQ("eq"), NE("ne"),
    ILIKE("ilike"), NOTILIKE("!ilike"),
    LIKE("like"), NOTLIKE("!like"),
    GT("gt"), GE("ge"),
    LT("lt"), LE("le"),
    IN("in");

    private String op;

    Operator(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }
}
