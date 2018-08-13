package com.hisptz.hris.Bundles.FieldOptionGroupSetBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupSetQuery implements GraphQLQueryResolver {
    @Autowired
    protected FieldOptionGroupSetRepository fieldOptionGroupSetRepository;

    public FieldOptionGroupSetQuery(FieldOptionGroupSetRepository fieldOptionGroupSetRepository) {
        this.fieldOptionGroupSetRepository = fieldOptionGroupSetRepository;
    }

    public List<FieldOptionGroupSet> fieldOptionGroupSets(){
        return fieldOptionGroupSetRepository.findAll();
    }

    public FieldOptionGroupSet getFieldOptionGroupSetById(Long id){
        return fieldOptionGroupSetRepository.findOne(id);
    }
}
