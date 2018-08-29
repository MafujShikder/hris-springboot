package com.hisptz.hris.Bundles.FieldGroupSetBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldGroupSetQuery extends ModelQuery<FieldGroupSet> {
    @Autowired
    protected FieldGroupSetRepository fieldGroupSetRepository;

    private ModelSpecification<FieldGroupSet> spec;

    public FieldGroupSetQuery(FieldGroupSetRepository fieldGroupSetRepository) {
        this.fieldGroupSetRepository = fieldGroupSetRepository;
    }

    public FieldGroupSet getFieldGroupSetsById(Long id){
        return fieldGroupSetRepository.findOne(id);
    }

    public List<FieldGroupSet> FieldGroupSets(String where, String sort){
        return query(where, spec, fieldGroupSetRepository, sort);
    }
}
