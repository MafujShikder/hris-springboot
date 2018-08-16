package com.hisptz.hris.Bundles.UserBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import com.hisptz.hris.core.ModelRepository;
import com.hisptz.hris.core.ModelResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/7/18.
 */
@Component
public class UserResolver extends ModelResolver<User> {
    public UserResolver(ModelRepository<User> repository) { super(repository);}
}
