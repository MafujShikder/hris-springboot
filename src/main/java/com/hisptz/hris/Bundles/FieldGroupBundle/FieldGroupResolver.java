package com.hisptz.hris.Bundles.FieldGroupBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by Guest on 8/10/18.
 */
@Component
public class FieldGroupResolver implements GraphQLResolver<FieldGroup> {
    @Autowired
    private FieldGroupRepository fieldGroupRepository;

    @Autowired
    private FieldRepository fieldRepository;

    public FieldGroupResolver(FieldGroupRepository fieldGroupRepository,FieldRepository fieldRepository) {
        this.fieldGroupRepository = fieldGroupRepository;
        this.fieldRepository = fieldRepository;
    }

}
