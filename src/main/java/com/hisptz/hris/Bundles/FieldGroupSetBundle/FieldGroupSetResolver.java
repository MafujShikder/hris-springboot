package com.hisptz.hris.Bundles.FieldGroupSetBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/10/18.
 */

@Component
public class FieldGroupSetResolver implements GraphQLResolver<FieldGroupSet> {
    @Autowired
    private FieldGroupSetRepository fieldGroupSetRepository;

    public FieldGroupSetResolver(FieldGroupSetRepository fieldGroupSetRepository) {
        this.fieldGroupSetRepository = fieldGroupSetRepository;
    }
}
