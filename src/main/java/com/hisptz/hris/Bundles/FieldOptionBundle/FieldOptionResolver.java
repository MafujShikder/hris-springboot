package com.hisptz.hris.Bundles.FieldOptionBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/10/18.
 */

@Component
public class FieldOptionResolver implements GraphQLResolver<FieldOption> {
    @Autowired
    private FieldOptionRepository fieldOptionRepository;

    @Autowired
    private FieldRepository fieldRepository;

    public FieldOptionResolver(FieldOptionRepository fieldOptionRepository, FieldRepository fieldRepository) {
        this.fieldOptionRepository = fieldOptionRepository;
        this.fieldRepository = fieldRepository;
    }

    public Field getField(FieldOption fieldOption){
        return fieldRepository.findOne(fieldOption.getField().getId());
    }
}
