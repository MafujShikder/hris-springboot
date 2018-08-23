package com.hisptz.hris.Bundles.InputTypeBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class InputTypeResolver implements GraphQLResolver<InputType>{
    @Autowired
    InputTypeRepository inputTypeRepository;

    @Autowired
    private FieldRepository fieldRepository;

    public InputTypeResolver(InputTypeRepository inputTypeRepository,FieldRepository fieldRepository) {
        this.inputTypeRepository = inputTypeRepository;
        this.fieldRepository = fieldRepository;
    }

}
