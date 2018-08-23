package com.hisptz.hris.Bundles.FieldDataTypeBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FieldDataTypeMutation extends ModelMutation<FieldDataType>{
    @Autowired
    private FieldDataTypeRepository fieldDataTypeRepository;

    public FieldDataTypeMutation(FieldDataTypeRepository fieldDataTypeRepository) {
        this.fieldDataTypeRepository = fieldDataTypeRepository;
    }

    public FieldDataType newFieldDataType(String uid, String name, String description){
        FieldDataType fieldDataType =  new FieldDataType(uid, name, description);

        fieldDataTypeRepository.save(fieldDataType);
        return fieldDataType;
    }

    public Boolean deleteFieldDataType(Long id){
        return deleteModel(id, fieldDataTypeRepository);
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
