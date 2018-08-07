package com.hisptz.hris.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;

/**
 * Created by Guest on 8/7/18.
 */
public class UserResolver implements GraphQLResolver<User> {
   private UserRepository userRepository;

    public UserResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
