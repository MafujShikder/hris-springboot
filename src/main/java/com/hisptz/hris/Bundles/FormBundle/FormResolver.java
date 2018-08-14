package com.hisptz.hris.Bundles.FormBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormResolver implements GraphQLResolver<Form> {
    @Autowired
    private FormRepository formRepository;

    public FormResolver(FormRepository formRepository) {
        this.formRepository = formRepository;
    }
}
