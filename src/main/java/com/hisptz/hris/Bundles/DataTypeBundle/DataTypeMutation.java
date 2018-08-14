package com.hisptz.hris.Bundles.DataTypeBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.DataTypeBundle.DataType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class DataTypeMutation implements GraphQLMutationResolver {
    @Autowired
    private DataTypeRepository dataTypeRepository;

    public DataTypeMutation(DataTypeRepository dataTypeRepository) {
        this.dataTypeRepository = dataTypeRepository;
    }

    public DataType newDataType(String uid, String name, String description){
        DataType dataType = new DataType(uid, name, description);

        return dataType;
    }

    public Boolean deleteDataType(Long id){
        dataTypeRepository.delete(dataTypeRepository.findOne(id));
        return true;
    }

    public DataType updateDataType(Long id,String uid, String name, String description){
        DataType dataType = dataTypeRepository.findOne(id);

        if (uid != null)
            dataType.setUid(uid);

        if (name != null)
            dataType.setName(name);

        if (description != null)
            dataType.setDescription(description);

        return dataType;
    }
}
