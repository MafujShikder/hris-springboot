package com.hisptz.hris.core.rest.ErrorHandling;

/**
 * Created by Guest on 9/7/18.
 */
public enum HttpStatusCode {
    HTTP_STATUS_CODE_400("400"), HTTP_STATUS_CODE_403("403"), HTTP_STATUS_CODE_404("404");

    String httpStatusCode;

    HttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
}
