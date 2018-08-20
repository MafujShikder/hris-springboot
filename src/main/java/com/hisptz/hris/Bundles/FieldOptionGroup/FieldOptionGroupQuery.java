package com.hisptz.hris.Bundles.FieldOptionGroup;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.Model.Model;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
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

    public List<FieldOptionGroup> fieldOptionGroups(){
        return fieldOptionGroupRepository.findAll();
    }

    public FieldOptionGroup getFieldOptionGroupById(Long id){
        return fieldOptionGroupRepository.findOne(id);
    }

    public List<FieldOptionGroup> queryFieldOptionGroup(String where){
        return query(where, spec, fieldOptionGroupRepository);
    }

}
