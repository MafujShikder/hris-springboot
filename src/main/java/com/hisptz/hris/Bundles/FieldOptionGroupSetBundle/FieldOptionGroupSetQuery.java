package com.hisptz.hris.Bundles.FieldOptionGroupSetBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupSetQuery extends ModelQuery<FieldOptionGroupSet> {
    @Autowired
    protected FieldOptionGroupSetRepository fieldOptionGroupSetRepository;

    private ModelSpecification<FieldOptionGroupSet> spec;

    public FieldOptionGroupSetQuery(FieldOptionGroupSetRepository fieldOptionGroupSetRepository) {
        this.fieldOptionGroupSetRepository = fieldOptionGroupSetRepository;
    }

    public FieldOptionGroupSet getFieldOptionGroupSetById(Long id){
        return fieldOptionGroupSetRepository.getOne(id);
    }

    public List<FieldOptionGroupSet> FieldOptionGroupSet(String where, String sort){
        return query(where, spec, fieldOptionGroupSetRepository, sort);
    }
}
