package com.hisptz.hris.Bundles.UserBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class UserMutation extends ModelMutation {

//    public UserMutation(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public User newUser(Integer organisationunitId, String username, String usernameCanonical, String email, String emailCanonical, Boolean enabled, String salt, String password, Boolean locked, Boolean expired, Date expiresAt, String confirmationToken, Date passwordRequestedAt, String roles, Boolean credentialsExpired, Date credentialsExpireAt, String uid, String phonenumber, String jobtitle, String firstname, String middlename, String surname, Date deletedat, String description) {
        User user = new User(organisationunitId, username, usernameCanonical, email, emailCanonical, enabled, salt, password, locked, expired, expiresAt, confirmationToken, passwordRequestedAt, roles, credentialsExpired, credentialsExpireAt, uid, phonenumber, jobtitle, firstname, middlename, surname, deletedat, description);

        userRepository.save(user);
        return user;
    }

    public Boolean deleteUser(Long id) {
       return deleteModel(id, userRepository);
    }

    public User updateUser(Long id, Integer organisationunitId, String username, String usernameCanonical, String email, String emailCanonical, Boolean enabled, String salt, String password, Boolean locked, Boolean expired, Date expiresAt, String confirmationToken, Date passwordRequestedAt, String roles, Boolean credentialsExpired, Date credentialsExpireAt, String uid, String phonenumber, String jobtitle, String firstname, String middlename, String surname, Date deletedat, String description) {
        User user = userRepository.findOne(id);

        /**
         * TODO: Optimize using the State Pattern
         */
        if (organisationunitId != null)
            user.setOrganisationunitId(organisationunitId);


        if (username != null)
            user.setUsername(username);


        if (usernameCanonical != null)
            user.setUsernameCanonical(usernameCanonical);


        if (email != null)
            user.setEmail(email);


        if (emailCanonical != null)
            user.setEmailCanonical(emailCanonical);


        if (enabled != null)
            user.setEnabled(enabled);


        if (salt != null)
            user.setSalt(salt);


        if (password != null)
            user.setPassword(password);


        if (locked != null)
            user.setLocked(locked);

        if (expired != null)
            user.setExpired(expired);

        if (expiresAt != null)
            user.setExpiresAt(expiresAt);

        if (confirmationToken != null)
            user.setConfirmationToken(confirmationToken);

        if (passwordRequestedAt != null)
            user.setPasswordRequestedAt(passwordRequestedAt);

        if (roles != null)
            user.setRoles(roles);

        if (credentialsExpired != null)
            user.setCredentialsExpired(credentialsExpired);

        if (credentialsExpireAt != null)
            user.setCredentialsExpireAt(credentialsExpireAt);

        if (uid != null)
            user.setUid(uid);

        if (phonenumber != null)
            user.setPhonenumber(phonenumber);

        if (jobtitle != null)
            user.setJobtitle(jobtitle);

        if (firstname != null)
            user.setFirstname(firstname);

        if (middlename != null)
            user.setMiddlename(middlename);

        if (surname != null)
            user.setSurname(surname);

        if (deletedat != null)
            user.setDeletedat(deletedat);

        if (description != null)
            user.setDescription(description);

        userRepository.save(user);
        return user;
    }

}