package com.hisptz.hris.core.rest.ErrorHandling;

/**
 * Created by Guest on 9/7/18.
 */
public enum Status {
    ERROR("ERROR"), OK("OK"), WARNING("WARNING");

    private String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
