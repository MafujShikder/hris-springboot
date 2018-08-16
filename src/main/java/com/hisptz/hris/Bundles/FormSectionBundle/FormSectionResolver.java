package com.hisptz.hris.Bundles.FormSectionBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */

@Component
public class FormSectionResolver implements GraphQLResolver<FormSection> {
    @Autowired
    private FormSectionRepository formSectionRepository;

    public FormSectionResolver(FormSectionRepository formSectionRepository) {
        this.formSectionRepository = formSectionRepository;
    }
}
