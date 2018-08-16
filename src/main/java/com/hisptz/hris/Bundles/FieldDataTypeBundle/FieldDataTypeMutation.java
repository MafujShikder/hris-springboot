package com.hisptz.hris.Bundles.FieldDataTypeBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FieldDataTypeMutation implements GraphQLMutationResolver{
    @Autowired
    private FieldDataTypeRepository fieldDataTypeRepository;

    public FieldDataTypeMutation(FieldDataTypeRepository fieldDataTypeRepository) {
        this.fieldDataTypeRepository = fieldDataTypeRepository;
    }

    public FieldDataType newFieldDataType(String uid, String name, String description){
        return new FieldDataType(uid, name, description);
    }

    public Boolean deleteFieldDataType(Long id){
        fieldDataTypeRepository.delete(fieldDataTypeRepository.findOne(id));
        return true;
    }

    public FieldDataType updateFieldDataType(Long id, String uid, String name, String description){
        FieldDataType fieldDataType = fieldDataTypeRepository.findOne(id);

        if (uid != null)
            fieldDataType.setUid(uid);

        if (name != null)
            fieldDataType.setName(name);

        if (description != null)
            fieldDataType.setDescription(description);

        fieldDataTypeRepository.save(fieldDataType);
        return fieldDataType;
    }
}
