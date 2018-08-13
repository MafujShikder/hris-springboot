package com.hisptz.hris.Bundles.FieldGroupSetBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldGroupSetQuery implements GraphQLQueryResolver {
    @Autowired
    protected FieldGroupSetRepository fieldGroupSetRepository;

    public FieldGroupSetQuery(FieldGroupSetRepository fieldGroupSetRepository) {
        this.fieldGroupSetRepository = fieldGroupSetRepository;
    }

    public List<FieldGroupSet> fieldGroupSets(){
        return fieldGroupSetRepository.findAll();
    }

    public FieldGroupSet getFieldGroupSetsById(Long id){
        return fieldGroupSetRepository.findOne(id);
    }

}
