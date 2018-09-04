package com.hisptz.hris.core.Model.rest;

import com.hisptz.hris.core.Model.main.Model;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Guest on 9/4/18.
 */
@Component
public class Data {
    String model;
    List<Map<String, String>> columns;

    public Data() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Map<String, String>> getColumns() {
        return columns;
    }

    public void setColumns(List<Map<String, String>> columns) {
        this.columns = columns;
    }
}
