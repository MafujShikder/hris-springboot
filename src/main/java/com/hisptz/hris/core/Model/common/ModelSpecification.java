package com.hisptz.hris.core.Model.common;

import com.hisptz.hris.core.Model.main.Model;
import com.hisptz.hris.core.rest.QueryStructure.Operator;
import com.hisptz.hris.core.rest.QueryStructure.QueryCriteria;
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
        if (queryCriteria.getOperation().equalsIgnoreCase(Operator.ILIKE.getOp()) || queryCriteria.getOperation().equalsIgnoreCase(Operator.LIKE.getOp())){

            return criteriaBuilder.like(
                    root.<String> get(queryCriteria.getKey()), queryCriteria.getValue());
        } else if (queryCriteria.getOperation().equalsIgnoreCase(Operator.EQ.getOp())) {

            return criteriaBuilder.equal(
                    root.<String> get(queryCriteria.getKey()), queryCriteria.getValue());
        } else if (queryCriteria.getOperation().equalsIgnoreCase(Operator.NOTILIKE.getOp()) || queryCriteria.getOperation().equalsIgnoreCase(Operator.NOTLIKE.getOp())){

            return criteriaBuilder.notLike(root.get(queryCriteria.getKey()), queryCriteria.getValue());
        } else if (queryCriteria.getOperation().equalsIgnoreCase(Operator.GE.getOp())){

            return criteriaBuilder.greaterThanOrEqualTo(root.get(queryCriteria.getKey()), queryCriteria.getValue());
        }   else if (queryCriteria.getOperation().equalsIgnoreCase(Operator.GT.getOp())){

            return criteriaBuilder.greaterThan(root.get(queryCriteria.getKey()), queryCriteria.getValue());
        }   else if (queryCriteria.getOperation().equalsIgnoreCase(Operator.LT.getOp())){

            return criteriaBuilder.lessThan(root.get(queryCriteria.getKey()), queryCriteria.getValue());
        }   else if (queryCriteria.getOperation().equalsIgnoreCase(Operator.LE.getOp())){

            return criteriaBuilder.lessThanOrEqualTo(root.get(queryCriteria.getKey()), queryCriteria.getValue());
        } else if (queryCriteria.getOperation().equalsIgnoreCase(Operator.NE.getOp())){

            return criteriaBuilder.notEqual(root.get(queryCriteria.getKey()), queryCriteria.getValue());
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
