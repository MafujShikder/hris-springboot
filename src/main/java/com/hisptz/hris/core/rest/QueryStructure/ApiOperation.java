package com.hisptz.hris.core.rest.QueryStructure;

import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Guest on 9/13/18.
 */
public abstract class ApiOperation {
    protected String model;
    protected List<String> fields;

    public String getModel() {
        return model;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public void setModel(String model) {
        this.model = StringUtils.capitalize(model);
    }

}
