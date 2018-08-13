package com.hisptz.hris.Bundles.FieldOptionGroup;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupQuery implements GraphQLQueryResolver {
    @Autowired
    protected FieldOptionGroupRepository fieldOptionGroupRepository;

    public FieldOptionGroupQuery(FieldOptionGroupRepository fieldOptionGroupRepository) {
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
    }

    public List<FieldOptionGroup> fieldOptionGroups(){
        return fieldOptionGroupRepository.findAll();
    }

    public FieldOptionGroup getFieldOptionGroupById(Long id){
        return fieldOptionGroupRepository.findOne(id);
    }

}
