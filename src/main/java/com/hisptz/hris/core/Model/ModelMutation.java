package com.hisptz.hris.core.Model;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

/**
 * Created by Guest on 8/20/18.
 */
public class ModelMutation<T extends Model> implements GraphQLMutationResolver {

    public Boolean deleteModel(Long id, ModelRepository<T> repository){
        repository.delete(repository.findOne(id));
        return true;
    }
}
