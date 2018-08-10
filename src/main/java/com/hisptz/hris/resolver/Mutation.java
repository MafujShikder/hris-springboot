package com.hisptz.hris.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroup;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSet;
import com.hisptz.hris.Bundles.FieldGroupSetBundle.FieldGroupSetRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroup;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroupRepository;
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

    @Autowired
    private FieldRepository fieldRepository;

    @Autowired
    private FieldOptionRepository fieldOptionRepository;

    @Autowired
    private FieldGroupRepository fieldGroupRepository;

    @Autowired
    private FieldGroupSetRepository fieldGroupSetRepository;

    @Autowired
    private FieldOptionGroupRepository fieldOptionGroupRepository;

    public Mutation(UserRepository userRepository, FieldRepository fieldRepository, FieldOptionRepository fieldOptionRepository, FieldGroupRepository fieldGroupRepository, FieldGroupSetRepository fieldGroupSetRepository, FieldOptionGroupRepository fieldOptionGroupRepository) {
        this.userRepository = userRepository;
        this.fieldRepository = fieldRepository;
        this.fieldOptionRepository = fieldOptionRepository;
        this.fieldGroupRepository = fieldGroupRepository;
        this.fieldGroupSetRepository = fieldGroupSetRepository;
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
    }

    /**
     *TODO: Optimize using Aspect Oriented Programming
     */

    /**
     * User Mutations
     */
    public User newUser(Integer organisationunitId, String username, String usernameCanonical, String email, String emailCanonical, Boolean enabled, String salt, String password, Boolean locked, Boolean expired, Date expiresAt, String confirmationToken, Date passwordRequestedAt, String roles, Boolean credentialsExpired, Date credentialsExpireAt, String uid, String phonenumber, String jobtitle, String firstname, String middlename, String surname, Date deletedat, String description) {
        User user = new User(organisationunitId, username, usernameCanonical, email, emailCanonical, enabled, salt, password, locked, expired, expiresAt, confirmationToken, passwordRequestedAt, roles, credentialsExpired, credentialsExpireAt, uid, phonenumber, jobtitle, firstname, middlename, surname, deletedat, description);

        userRepository.save(user);
        return user;
    }

    public Boolean deleteUser(Long id) {
        userRepository.delete(userRepository.findOne(id));
        return true;
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


    /**
     * Field Mutations
     */
    public Field newField(Integer datatypeId, Integer inputtypeId, String uid, String name, String caption, Boolean compulsory, Boolean isunique, Boolean iscalculated, String description, String calculatedexpression, Boolean hashistory, Boolean hastarget, Boolean fieldrelation, Boolean skipinreport) {
        Field field = new Field(datatypeId, inputtypeId, uid, name, caption, compulsory, isunique, iscalculated, description, calculatedexpression, hashistory, hastarget, fieldrelation, skipinreport);

        fieldRepository.save(field);
        return field;
    }

    public Boolean deleteField(Long id) {
        fieldRepository.delete(fieldRepository.findOne(id));
        return true;
    }

    public Field updateField(Long id, Integer datatypeId, Integer inputtypeId, String uid, String name, String caption, Boolean compulsory, Boolean isunique, Boolean iscalculated, String description, String calculatedexpression, Boolean hashistory, Boolean hastarget, Boolean fieldrelation, Boolean skipinreport) {
        Field field = fieldRepository.findOne(id);

        if (datatypeId != null)
            field.setDatatypeId(datatypeId);

        if (inputtypeId != null)
            field.setInputtypeId(inputtypeId);

        if (uid != null)
            field.setUid(uid);

        if (name != null)
            field.setName(name);

        if (caption != null)
            field.setCaption(name);

        if (compulsory != null)
            field.setCompulsory(compulsory);

        if (isunique != null)
            field.setIsunique(isunique);

        if (iscalculated != null)
            field.setIscalculated(iscalculated);

        if (description != null)
            field.setDescription(description);

        if (calculatedexpression != null)
            field.setCalculatedexpression(calculatedexpression);

        if (hashistory != null)
            field.setHashistory(hashistory);

        if (hastarget != null)
            field.setHastarget(hastarget);

        if (fieldrelation != null)
            field.setFieldrelation(fieldrelation);

        if (skipinreport != null)
            field.setSkipinreport(skipinreport);

        fieldRepository.save(field);
        return field;
    }


    /**
     * FieldOption Mutations
     */
    public FieldOption newFieldOption(Integer fieldId, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining) {
        FieldOption fieldOption = new FieldOption(fieldId, uid, value, skipinreport, description, sort, hastraining);

        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

    public Boolean deleteFieldOption(Long id) {
        fieldOptionRepository.delete(fieldOptionRepository.findOne(id));
        return true;
    }

    public FieldOption updateFieldOption(Long id, Integer fieldId, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining) {
        FieldOption fieldOption = fieldOptionRepository.findOne(id);

        if (fieldId != null)
            fieldOption.setFieldId(fieldId);

        if (uid != null)
            fieldOption.setUid(uid);

        if (value != null)
            fieldOption.setValue(value);

        if (skipinreport != null)
            fieldOption.setSkipinreport(skipinreport);

        if (description != null)
            fieldOption.setDescription(description);

        if (sort != null)
            fieldOption.setSort(sort);

        if (hastraining != null)
            fieldOption.setHastraining(hastraining);

        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

    /**
     * FieldGroups Mutations
     */
    public FieldGroup newFieldGroup(String uid, String name, String operator, String description) {
        FieldGroup fieldGroup = new FieldGroup(uid, name, operator, description);

        fieldGroupRepository.save(fieldGroup);
        return fieldGroup;
    }

    public Boolean deleteFieldGroup(Long id) {
        fieldGroupRepository.delete(fieldGroupRepository.findOne(id));
        return true;
    }

    public FieldGroup updateFieldGroup(Long id, String uid, String name, String operator, String description) {
        FieldGroup fieldGroup = fieldGroupRepository.findOne(id);

        if (uid != null)
            fieldGroup.setUid(uid);

        if (name != null)
            fieldGroup.setName(name);

        if (description != null)
            fieldGroup.setDescription(description);

        if (operator != null)
            fieldGroup.setOperator(operator);

        fieldGroupRepository.save(fieldGroup);
        return fieldGroup;
    }

    /**
     * FieldGroupSet Mutations
     */
    public FieldGroupSet newFieldGroupSet(String uid, String name, String description) {
        FieldGroupSet fieldGroupSet = new FieldGroupSet(uid, name, description);

        fieldGroupSetRepository.save(fieldGroupSet);
        return fieldGroupSet;
    }

    public Boolean deleteFieldGroupSet(Long id) {
        fieldGroupSetRepository.delete(fieldGroupSetRepository.findOne(id));
        return true;
    }

    public FieldGroupSet updateFieldGroupSet(Long id, String uid, String name, String description) {
        FieldGroupSet fieldGroupSet = fieldGroupSetRepository.findOne(id);

        if (uid != null)
            fieldGroupSet.setUid(uid);

        if (name != null)
            fieldGroupSet.setName(name);

        if (description != null)
            fieldGroupSet.setDescription(description);

        fieldGroupSetRepository.save(fieldGroupSet);
        return fieldGroupSet;
    }

    /**
     * FieldOptionGroup Mutations
     */



    public FieldOptionGroup newFieldOptionGroup(String uid, String name, String description, Integer fieldId, String operator) {
        FieldOptionGroup fieldOptionGroup = new FieldOptionGroup(fieldId,uid, name, description, operator);

        fieldOptionGroupRepository.save(fieldOptionGroup);
        return fieldOptionGroup;
    }

    public Boolean deleteFieldOptionGroup(Long id){
        fieldOptionGroupRepository.delete(fieldOptionGroupRepository.findOne(id));
        return true;
    }

    public FieldOptionGroup updateFieldOptionGroup(Long id, String uid, String name, String description, String operator, Integer fieldId){
        FieldOptionGroup fieldOptionGroup = fieldOptionGroupRepository.findOne(id);

        if (uid != null)
            fieldOptionGroup.setUid(uid);

        if (name != null)
            fieldOptionGroup.setName(name);

        if (description != null)
            fieldOptionGroup.setDescription(description);

        if (fieldId != null)
            fieldOptionGroup.setFieldId(fieldId);

        if (operator != null)
            fieldOptionGroup.setOperator(operator);

        fieldOptionGroupRepository.save(fieldOptionGroup);
        return fieldOptionGroup;
    }
}