package com.hisptz.hris.Bundles.DataTypeBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class DataTypeQuery extends ModelQuery<DataType>{
    @Autowired
    private DataTypeRepository dataTypeRepository;

    private ModelSpecification<DataType> spec;

    public DataTypeQuery(DataTypeRepository dataTypeRepository) {
        this.dataTypeRepository = dataTypeRepository;
    }

    public DataType getDataTypeById(Long id){
        return dataTypeRepository.findOne(id);
    }

    public List<DataType> DataType(String where, String sort){
        return query(where, spec, dataTypeRepository, sort);
    }
}
