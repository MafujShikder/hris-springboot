package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.DataTypeBundle.DataType;
import com.hisptz.hris.Bundles.DataTypeBundle.DataTypeRepository;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.InputTypeBundle.InputType;
import com.hisptz.hris.Bundles.InputTypeBundle.InputTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/10/18.
 */
@Component
public class FieldResolver implements GraphQLResolver<Field>{
    @Autowired
    private FieldRepository fieldRepository;

    @Autowired
    private FieldGroupRepository fieldGroupRepository;

    @Autowired
    private InputTypeRepository inputTypeRepository;

    @Autowired
    private DataTypeRepository dataTypeRepository;

    public FieldResolver(FieldRepository fieldRepository, FieldGroupRepository fieldGroupRepository, InputTypeRepository inputTypeRepository, DataTypeRepository dataTypeRepository) {
        this.fieldRepository = fieldRepository;
        this.fieldGroupRepository = fieldGroupRepository;
        this.inputTypeRepository = inputTypeRepository;
        this.dataTypeRepository = dataTypeRepository;
    }

    public InputType getInputType(Field field){
        return inputTypeRepository.findOne(field.getInputType().getId());
    }

}
