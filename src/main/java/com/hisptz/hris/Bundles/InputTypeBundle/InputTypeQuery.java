package com.hisptz.hris.Bundles.InputTypeBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class InputTypeQuery extends ModelQuery<InputType> {
    @Autowired
    InputTypeRepository inputTypeRepository;

    private ModelSpecification<InputType> spec;

    public InputTypeQuery(InputTypeRepository inputTypeRepository) {
        this.inputTypeRepository = inputTypeRepository;
    }

    public List<InputType> inputTypes(){
       return  inputTypeRepository.findAll();
    }

    public InputType getInputTypeById(Long id){
        return inputTypeRepository.findOne(id);
    }

    public List<InputType> queryInputType(String where){
        return query(where, spec, inputTypeRepository);
    }
}
