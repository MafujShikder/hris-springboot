package com.hisptz.hris.Bundles.FieldOptionBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/10/18.
 */

@Component
public class FieldOptionResolver implements GraphQLResolver<FieldOption> {
    @Autowired
    private FieldOptionRepository fieldOptionRepository;

    public FieldOptionResolver(FieldOptionRepository fieldOptionRepository) {
        this.fieldOptionRepository = fieldOptionRepository;
    }
}
