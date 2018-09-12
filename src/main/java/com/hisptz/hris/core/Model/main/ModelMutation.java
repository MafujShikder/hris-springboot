package com.hisptz.hris.core.Model.main;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.core.Model.common.ModelRepositories;

/**
 * Created by Guest on 8/20/18.
 */
public class ModelMutation<T extends Model> extends ModelRepositories implements GraphQLMutationResolver {

    public Boolean deleteModel(Long id, ModelRepository<T> repository){
        repository.delete(repository.getOne(id));
        return true;
    }
}
