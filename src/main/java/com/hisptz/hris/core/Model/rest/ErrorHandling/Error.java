package com.hisptz.hris.core.Model.rest.ErrorHandling;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Guest on 9/7/18.
 */
@Component
public class Error {
    private HttpStatus httpStatus;
    private String message;
    private HttpStatusCode httpStatusCode;
    private Status status;

    private Map<String, String> errorMap = new HashMap<>();

    public Error(HttpStatus httpStatus, String message, HttpStatusCode httpStatusCode, Status status) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.httpStatusCode = httpStatusCode;
        this.status = status;

        this.errorMap.put("httpStatus", httpStatus.getHttpStatus());
        this.errorMap.put("message", message);
        this.errorMap.put("httpStatusCode", httpStatusCode.getHttpStatusCode());
        this.errorMap.put("status", status.getStatus());
    }

    public Error() {
    }

    public String getHttpStatus() {
        return httpStatus.getHttpStatus();
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.errorMap.put("httpStatus", httpStatus.getHttpStatus());
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.errorMap.put("message", message);
        this.message = message;
    }

    public String getHttpStatusCode() {
        return httpStatusCode.getHttpStatusCode();
    }

    public void setHttpStatusCode(HttpStatusCode httpStatusCode) {
        this.errorMap.put("httpStatusCode", httpStatusCode.getHttpStatusCode());
        this.httpStatusCode = httpStatusCode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.errorMap.put("status", status.getStatus());
        this.status = status;
    }

    public Map<String, String> getErrorMap() {
        return errorMap;
    }

    public void setErrorMap(Map<String, String> errorMap) {
        this.errorMap = errorMap;
    }
}
