package com.hisptz.hris.Bundles.FormBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormQuery extends ModelQuery<Form>{
    @Autowired
    private FormRepository formRepository;

    private ModelSpecification spec;

    public FormQuery(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public List<Form> forms(){
        return formRepository.findAll();
    }

    public Form getFormById(Long id){
        return formRepository.findOne(id);
    }

    public List<Form> queryForms(String where){
        return query(where, spec, formRepository);
    }
}
