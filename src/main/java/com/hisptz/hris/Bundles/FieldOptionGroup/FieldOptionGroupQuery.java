package com.hisptz.hris.Bundles.FieldOptionGroup;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupQuery extends ModelQuery<FieldOptionGroup> {
    @Autowired
    protected FieldOptionGroupRepository fieldOptionGroupRepository;

    private ModelSpecification<FieldOptionGroup> spec;

    public FieldOptionGroupQuery(FieldOptionGroupRepository fieldOptionGroupRepository) {
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
    }

    public FieldOptionGroup getFieldOptionGroupById(Long id){
        return fieldOptionGroupRepository.findOne(id);
    }

    public List<FieldOptionGroup> FieldOptionGroup(String where,String sort){
        return query(where, spec, fieldOptionGroupRepository, sort);
    }

}
