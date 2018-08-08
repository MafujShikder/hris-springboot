package com.hisptz.hris.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

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



    public User newUser(int organisationunitId, String username, String usernameCanonical, String email, String emailCanonical, boolean enabled, String salt, String password, boolean locked, boolean expired, Date expiresAt, String confirmationToken, Date passwordRequestedAt, String roles, boolean credentialsExpired, Date credentialsExpireAt, String uid, String phonenumber, String jobtitle, String firstname, String middlename, String surname, Date deletedat, String description) {
       User user = new User(organisationunitId, username, usernameCanonical, email, emailCanonical, enabled, salt, password, locked, expired, expiresAt, confirmationToken, passwordRequestedAt, roles, credentialsExpired, credentialsExpireAt,  uid, phonenumber,  jobtitle, firstname, middlename, surname, deletedat, description);

        userRepository.save(user);
        return user;
    }
}
