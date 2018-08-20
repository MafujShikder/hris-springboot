package com.hisptz.hris.Bundles.FieldBundle;

import com.hisptz.hris.core.Model.ModelSpecification;
import com.hisptz.hris.core.QueryStructure.QueryCriteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by Guest on 8/17/18.
 */

public class FieldSpecification extends ModelSpecification<Field>{
    private QueryCriteria queryCriteria;

    public FieldSpecification(QueryCriteria queryCriteria) {
        super(queryCriteria);
    }
}
