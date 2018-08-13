package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldQuery implements GraphQLQueryResolver {
    @Autowired
    protected FieldRepository fieldRepository;

    public FieldQuery(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    public List<Field> fields(){
        return fieldRepository.findAll();
    }

    public Field getFieldById(Long id){
        return fieldRepository.findOne(id);
    }
}
