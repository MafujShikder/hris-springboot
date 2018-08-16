package com.hisptz.hris.core;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vincent on 8/16/18.
 */
public class ModelResolver<T extends Model> implements GraphQLResolver<Model> {
    @Autowired
    private ModelRepository<T> repository;

    public ModelResolver(ModelRepository<T> repository) { this.repository = repository; }
}
