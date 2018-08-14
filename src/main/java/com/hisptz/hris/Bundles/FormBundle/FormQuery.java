package com.hisptz.hris.Bundles.FormBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormQuery implements GraphQLQueryResolver {
    @Autowired
    private FormRepository formRepository;

    public FormQuery(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public List<Form> forms(){
        return formRepository.findAll();
    }

    public Form getFormById(Long id){
        return formRepository.findOne(id);
    }
}
