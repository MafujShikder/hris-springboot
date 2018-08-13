package com.hisptz.hris.Bundles.FieldGroupBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldGroupQuery implements GraphQLQueryResolver {
    @Autowired
    protected FieldGroupRepository fieldGroupRepository;

    public FieldGroupQuery(FieldGroupRepository fieldGroupRepository) {
        this.fieldGroupRepository = fieldGroupRepository;
    }

    public List<FieldGroup> fieldGroups(){
        return fieldGroupRepository.findAll();
    }

    public FieldGroup getFieldGroupById(Long id){
        return fieldGroupRepository.findOne(id);
    }

}
