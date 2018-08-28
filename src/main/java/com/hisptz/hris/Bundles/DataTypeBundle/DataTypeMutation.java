package com.hisptz.hris.Bundles.DataTypeBundle;

import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class DataTypeMutation extends ModelMutation<DataType>{

    public DataTypeMutation(DataTypeRepository dataTypeRepository) {
        this.dataTypeRepository = dataTypeRepository;
    }

    public DataType newDataType(String name, String description, Long fieldId){
        DataType dataType =  new DataType( name, description);

//        if (fieldId != null)
//            dataType.getFields().add(fieldRepository.getOne(fieldId));
        if (fieldId != null)
            dataType.setField(fieldRepository.findOne(fieldId));

        dataTypeRepository.save(dataType);
        return dataType;
    }

    public Boolean deleteDataType(Long id){
        return deleteModel(id, dataTypeRepository);
    }

    public DataType updateDataType(Long id, String uid, String name, String description, Long fieldId){
        DataType dataType = dataTypeRepository.findOne(id);

        if (uid != null)
            dataType.setUid(uid);

        if (name != null)
            dataType.setName(name);

        if (description != null)
            dataType.setDescription(description);

//        if (fieldId != null)
//            dataType.getFields().add(fieldRepository.getOne(fieldId));
        if (fieldId != null)
            dataType.setField(fieldRepository.findOne(fieldId));

        dataTypeRepository.save(dataType);
        return dataType;
    }
}
