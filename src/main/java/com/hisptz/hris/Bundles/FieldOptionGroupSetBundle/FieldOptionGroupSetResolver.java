package com.hisptz.hris.Bundles.FieldOptionGroupSetBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupSetResolver implements GraphQLResolver<FieldOptionGroupSet> {
    @Autowired
    private FieldOptionGroupSetRepository fieldOptionGroupSetRepository;

    public FieldOptionGroupSetResolver(FieldOptionGroupSetRepository fieldOptionGroupSetRepository) {
        this.fieldOptionGroupSetRepository = fieldOptionGroupSetRepository;
    }
}
