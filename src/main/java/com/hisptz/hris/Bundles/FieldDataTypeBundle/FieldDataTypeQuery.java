package com.hisptz.hris.Bundles.FieldDataTypeBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FieldDataTypeQuery implements GraphQLQueryResolver{
    @Autowired
    private FieldDataTypeRepository fieldDataTypeRepository;

    public FieldDataTypeQuery(FieldDataTypeRepository fieldDataTypeRepository) {
        this.fieldDataTypeRepository = fieldDataTypeRepository;
    }

    public List<FieldDataType> fieldDataTypes(){
       return fieldDataTypeRepository.findAll();
    }

    public FieldDataType getFieldDataTypeById(Long id){
        return fieldDataTypeRepository.findOne(id);
    }

}
