package com.hisptz.hris.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/7/18.
 */
@Component
public class Mutation implements GraphQLMutationResolver {
    UserRepository userRepository;

    public Mutation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User newUser(int id){
        User user = new User();
        user.setId(id);

        userRepository.save(user);
        return user;
    }
}
