package com.hisptz.hris.Bundles.UserBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import com.hisptz.hris.core.ModelQuery;
import com.hisptz.hris.core.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<User> getUsers(String query){
        System.console().printf("Query:" + query);
        return this.query(query);
    }
}
