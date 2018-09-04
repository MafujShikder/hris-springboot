package com.hisptz.hris.core.Model.rest;

import com.hisptz.hris.core.Model.main.Model;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 9/4/18.
 */
@Component
public class Data {
    String data;
    Object models;

    public Data() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Object getModels() {
        return models;
    }

    public void setModels(Object models) {
        this.models = models;
    }
}
