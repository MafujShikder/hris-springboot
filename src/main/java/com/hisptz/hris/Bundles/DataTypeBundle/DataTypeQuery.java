package com.hisptz.hris.Bundles.DataTypeBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.Bundles.DataTypeBundle.DataType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class DataTypeQuery implements GraphQLQueryResolver{
    @Autowired
    private DataTypeRepository dataTypeRepository;

    public DataTypeQuery(DataTypeRepository dataTypeRepository) {
        this.dataTypeRepository = dataTypeRepository;
    }

    public List<DataType> dataTypes(){
        return  dataTypeRepository.findAll();
    }

    public DataType getDataTypeById(Long id){
        return dataTypeRepository.findOne(id);
    }
}
