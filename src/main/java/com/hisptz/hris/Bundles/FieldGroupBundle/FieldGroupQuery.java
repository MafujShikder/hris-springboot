package com.hisptz.hris.Bundles.FieldGroupBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
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
        return fieldGroupRepository.findOne(id);
    }

    public List<FieldGroup> FieldGroups(String where, String orderBy){
        return query(where, spec, fieldGroupRepository, orderBy);
    }

}
