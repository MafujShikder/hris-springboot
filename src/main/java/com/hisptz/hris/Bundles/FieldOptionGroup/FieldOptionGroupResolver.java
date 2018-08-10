package com.hisptz.hris.Bundles.FieldOptionGroup;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/10/18.
 */
@Component
public class FieldOptionGroupResolver implements GraphQLResolver<FieldOptionGroup> {
    @Autowired
    private FieldOptionGroupRepository fieldOptionGroupRepository;

    public FieldOptionGroupResolver(FieldOptionGroupRepository fieldOptionGroupRepository) {
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
    }
}
