package com.hisptz.hris.core.Model;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vincent on 8/16/18.
 */
public class ModelMutation<T extends Model> implements GraphQLMutationResolver {
    @Autowired
    protected ModelRepository<T> repository;

    public ModelMutation(ModelRepository<T> repository) {
        this.repository = repository;
    }

    public T create(Object... args) {
        /*T model = new Model();

        repository.save(model);*/
        return null;
    }

    public Boolean delete(Long id) {
        repository.delete(repository.findOne(id));
        return true;
    }

    public T update(Long id) {
        T model = repository.findOne(id);
        
        repository.save(model);
        return model;
    }
}
