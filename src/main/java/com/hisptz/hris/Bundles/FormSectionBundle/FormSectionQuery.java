package com.hisptz.hris.Bundles.FormSectionBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.Bundles.FormSectionBundle.FormSection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormSectionQuery implements GraphQLQueryResolver{
    @Autowired
    private FormSectionRepository formSectionRepository;

    public FormSectionQuery(FormSectionRepository formSectionRepository) {
        this.formSectionRepository = formSectionRepository;
    }

    public List<FormSection> formSections(){
        return  formSectionRepository.findAll();
    }

    public FormSection getFormSectionById(Long id){
        return formSectionRepository.findOne(id);
    }
}
