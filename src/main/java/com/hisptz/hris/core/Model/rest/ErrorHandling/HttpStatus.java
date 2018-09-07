package com.hisptz.hris.core.Model.rest.ErrorHandling;

/**
 * Created by Guest on 9/7/18.
 */
public enum HttpStatus {
    FORBIDDEN("Forbidden"), OK("OK"), ERROR("ERROR");

    String httpStatus;

    HttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }
}
