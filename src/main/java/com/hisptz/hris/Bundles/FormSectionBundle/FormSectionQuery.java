package com.hisptz.hris.Bundles.FormSectionBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormSectionQuery extends ModelQuery<FormSection>{
    @Autowired
    private FormSectionRepository formSectionRepository;

    private ModelSpecification<FormSection> spec;

    public FormSectionQuery(FormSectionRepository formSectionRepository) {
        this.formSectionRepository = formSectionRepository;
    }

    public FormSection getFormSectionById(Long id){
        return formSectionRepository.getOne(id);
    }

    public List<FormSection> FormSections(String where, String sort){
        return query(where, spec, formSectionRepository, sort);
    }
}
