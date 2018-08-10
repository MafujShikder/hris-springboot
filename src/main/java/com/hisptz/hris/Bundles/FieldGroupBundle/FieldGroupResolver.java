package com.hisptz.hris.Bundles.FieldGroupBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/10/18.
 */
@Component
public class FieldGroupResolver implements GraphQLResolver<FieldGroup> {
    @Autowired
    private FieldGroupRepository fieldGroupRepository;

    public FieldGroupResolver(FieldGroupRepository fieldGroupRepository) {
        this.fieldGroupRepository = fieldGroupRepository;
    }
}
