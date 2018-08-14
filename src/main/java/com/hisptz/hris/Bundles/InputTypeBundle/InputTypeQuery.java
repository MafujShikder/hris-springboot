package com.hisptz.hris.Bundles.InputTypeBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class InputTypeQuery implements GraphQLQueryResolver{
    @Autowired
    InputTypeRepository inputTypeRepository;

    public InputTypeQuery(InputTypeRepository inputTypeRepository) {
        this.inputTypeRepository = inputTypeRepository;
    }

    public List<InputType> inputTypes(){
       return  inputTypeRepository.findAll();
    }

    public InputType getInputTypeById(Long id){
        return inputTypeRepository.findOne(id);
    }
}
