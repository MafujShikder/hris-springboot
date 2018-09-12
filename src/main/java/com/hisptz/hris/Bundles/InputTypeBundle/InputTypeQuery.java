package com.hisptz.hris.Bundles.InputTypeBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
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

    public InputType getInputTypeById(Long id){
        return inputTypeRepository.getOne(id);
    }

    public List<InputType> InputType(String where, String sort){
        return query(where, spec, inputTypeRepository, sort);
    }
}
