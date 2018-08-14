package com.hisptz.hris.Bundles.ArithmeticFilterBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ArithmeticFilterResolver implements GraphQLResolver<ArithmeticFilter> {
    @Autowired
    ArithmeticFilterRepository arithmeticFilterRepository;

    public ArithmeticFilterResolver(ArithmeticFilterRepository arithmeticFilterRepository) {
        this.arithmeticFilterRepository = arithmeticFilterRepository;
    }
}
