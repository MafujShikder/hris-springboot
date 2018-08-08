package com.hisptz.hris.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * Created by Guest on 8/7/18.
 */
@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private UserRepository userRepository;

    public Mutation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User newUser(int organisationunitId, String username, String usernameCanonical, String email, String emailCanonical, boolean enabled, String salt, String password, boolean locked) {
       User user = new User(organisationunitId, username, usernameCanonical, email, emailCanonical, enabled,salt, password, locked);

        userRepository.save(user);
        return user;
    }
}
