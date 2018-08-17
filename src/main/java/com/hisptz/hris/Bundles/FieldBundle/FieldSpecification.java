package com.hisptz.hris.Bundles.FieldBundle;

import com.hisptz.hris.core.QueryStructure.QueryCriteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by Guest on 8/17/18.
 */

public class FieldSpecification implements Specification<Field> {

    private QueryCriteria queryCriteria;

    @Override
    public Predicate toPredicate(Root<Field> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

        if (queryCriteria.getOperation().equalsIgnoreCase("ilike")){
            return criteriaBuilder.like(
                    root.<String> get(queryCriteria.getKey()), queryCriteria.getValue().toString());
        } else if (queryCriteria.getOperation().equalsIgnoreCase("eq")) {
            return criteriaBuilder.equal(
                    root.<String>get(queryCriteria.getKey()), queryCriteria.getValue().toString());
        }
//        } else {
//            try {
//                throw new Exception("Wrong format");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        return null;
    }

    public FieldSpecification(QueryCriteria queryCriteria) {
        this.queryCriteria = queryCriteria;
    }
}
