package com.hisptz.hris.Bundles.FieldGroupBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldGroupQuery extends ModelQuery<FieldGroup> {
    @Autowired
    protected FieldGroupRepository fieldGroupRepository;

    private ModelSpecification<FieldGroup> spec;

    public FieldGroupQuery(FieldGroupRepository fieldGroupRepository) {
        this.fieldGroupRepository = fieldGroupRepository;
    }

    public FieldGroup getFieldGroupById(Long id){
        return fieldGroupRepository.getOne(id);
    }

    public List<FieldGroup> FieldGroups(String where, String sort){
        return query(where, spec, fieldGroupRepository, sort);
    }

}
