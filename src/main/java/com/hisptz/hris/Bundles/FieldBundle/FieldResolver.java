package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.FieldDataTypeBundle.FieldDataType;
import com.hisptz.hris.Bundles.FieldDataTypeBundle.FieldDataTypeRepository;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroup;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import com.hisptz.hris.Bundles.InputTypeBundle.InputType;
import com.hisptz.hris.Bundles.InputTypeBundle.InputTypeRepository;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

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
    private FieldDataTypeRepository fieldDataTypeRepository;

    public FieldResolver(FieldRepository fieldRepository,FieldGroupRepository fieldGroupRepository,InputTypeRepository inputTypeRepository, FieldDataTypeRepository fieldDataTypeRepository) {
        this.fieldRepository = fieldRepository;
        this.fieldGroupRepository = fieldGroupRepository;
        this.inputTypeRepository = inputTypeRepository;
        this.fieldDataTypeRepository = fieldDataTypeRepository;
    }

    public InputType getInputType(Field field){
        return inputTypeRepository.findOne(field.getInputType().getId());
    }

    public FieldDataType getFieldDataType(Field field){
        return fieldDataTypeRepository.findOne(field.getFieldDataType().getId());
    }

}
