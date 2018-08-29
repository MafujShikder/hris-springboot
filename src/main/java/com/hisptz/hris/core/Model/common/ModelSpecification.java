package com.hisptz.hris.core.Model.common;

import com.hisptz.hris.core.Model.main.Model;
import com.hisptz.hris.core.QueryStructure.Operation;
import com.hisptz.hris.core.QueryStructure.QueryCriteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by Guest on 8/20/18.
 */
public class ModelSpecification<T extends Model> implements Specification<T> {
    private QueryCriteria queryCriteria;

    public ModelSpecification(QueryCriteria queryCriteria) {
        this.queryCriteria = queryCriteria;
    }


    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        if (queryCriteria.getOperation().equalsIgnoreCase(Operation.ILIKE.getOp())){
            return criteriaBuilder.like(
                    root.<String> get(queryCriteria.getKey()), queryCriteria.getValue());
        } else if (queryCriteria.getOperation().equalsIgnoreCase(Operation.EQ.getOp())) {
            return criteriaBuilder.equal(
                    root.<String> get(queryCriteria.getKey()), queryCriteria.getValue());
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
}
