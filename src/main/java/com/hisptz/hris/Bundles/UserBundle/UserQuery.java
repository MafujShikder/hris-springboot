package com.hisptz.hris.Bundles.UserBundle;

import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class UserQuery extends ModelQuery<User> {

    public UserQuery(ModelRepository<User> repository) {
        super(repository);
    }
    public List<User> getUsers(String filters){

        return repository.findAll();
//        System.console().printf("Query:" + filters);
//        return this.query(filters);
    }

    public List<User> queryUsers(String filters){
        return repository.findAll();
    }
}
