package com.hisptz.hris.Bundles.DataTypeBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */

@Component
public class DataTypeResolver implements GraphQLResolver<DataType> {
    @Autowired
    private DataTypeRepository dataTypeRepository;

    public DataTypeResolver(DataTypeRepository dataTypeRepository) {
        this.dataTypeRepository = dataTypeRepository;
    }
}
