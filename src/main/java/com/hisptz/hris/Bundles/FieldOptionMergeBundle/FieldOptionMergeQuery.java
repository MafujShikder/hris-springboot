package com.hisptz.hris.Bundles.FieldOptionMergeBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FieldOptionMergeQuery extends ModelQuery<FieldOptionMerge> {
    @Autowired
    private FieldOptionMergeRepository fieldOptionMergeRepository;
    private ModelSpecification<FieldOptionMerge> spec;

    public FieldOptionMergeQuery(FieldOptionMergeRepository fieldOptionMergeRepository) {
        this.fieldOptionMergeRepository = fieldOptionMergeRepository;
    }

    public FieldOptionMerge getFieldOptionMergeById(Long id){
        return fieldOptionMergeRepository.findOne(id);
    }

    public List<FieldOptionMerge> queryFieldOptionMerge(String where, String orderBy){
        return query(where, spec, fieldOptionMergeRepository, orderBy);
    }
}
