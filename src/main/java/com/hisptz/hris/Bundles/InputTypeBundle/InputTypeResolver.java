package com.hisptz.hris.Bundles.InputTypeBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class InputTypeResolver implements GraphQLResolver<InputType>{
    @Autowired
    InputTypeRepository inputTypeRepository;

    public InputTypeResolver(InputTypeRepository inputTypeRepository) {
        this.inputTypeRepository = inputTypeRepository;
    }
}
