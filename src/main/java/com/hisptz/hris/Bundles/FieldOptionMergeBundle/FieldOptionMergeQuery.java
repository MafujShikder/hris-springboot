package com.hisptz.hris.Bundles.FieldOptionMergeBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
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

    public List<FieldOptionMerge> queryFieldOptionMerge(String where, String sort){
        return query(where, spec, fieldOptionMergeRepository, sort);
    }
}
