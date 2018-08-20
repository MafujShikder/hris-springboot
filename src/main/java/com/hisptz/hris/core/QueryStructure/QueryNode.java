package com.hisptz.hris.core.QueryStructure;

import java.util.List;

/**
 * Created by Guest on 8/17/18.
 */
public class QueryNode {
    private String joinOperation;
    private List<QueryCriteria> queryCriterias;

    public QueryNode(String query) {
        String rootPattern = ":\\[";

    }

    public String getJoinOperation() {
        return joinOperation;
    }

    public void setJoinOperation(String joinOperation) {
        this.joinOperation = joinOperation;
    }

    public List<QueryCriteria> getQueryCriterias() {
        return queryCriterias;
    }

    public void setQueryCriterias(List<QueryCriteria> queryCriterias) {
        this.queryCriterias = queryCriterias;
    }
}
