package com.hisptz.hris.core;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created by vincent on 8/16/18.
 */
public class ModelQuery<T extends Model> implements GraphQLQueryResolver {
    @Autowired
    protected ModelRepository<T> repository;

    public ModelQuery(ModelRepository<T> repository) {
        this.repository = repository;
    }

    public List<T> findAll(){
        return repository.findAll();
    }

    public T getById(Long id){
        return repository.findOne(id);
    }

    public List<T> users(){
        return repository.findAll();
    }

    public T getUserById(Long id){
        return repository.findOne(id);
    }
}
