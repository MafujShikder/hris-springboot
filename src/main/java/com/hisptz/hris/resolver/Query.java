package com.hisptz.hris.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroup;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/7/18.
 */
@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FieldRepository fieldRepository;

    @Autowired
    private FieldOptionRepository fieldOptionRepository;

    @Autowired
    private FieldGroupRepository fieldGroupRepository;

    public Query(UserRepository userRepository, FieldRepository fieldRepository, FieldOptionRepository fieldOptionRepository, FieldGroupRepository fieldGroupRepository) {
        this.userRepository = userRepository;
        this.fieldRepository = fieldRepository;
        this.fieldOptionRepository = fieldOptionRepository;
        this.fieldGroupRepository = fieldGroupRepository;
    }

    /**
     * Users Queries
     */
    public List<User> users(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findOne(id);
    }

    /**
     * Fields Queries
     */
    public  List<Field> fields(){
        return fieldRepository.findAll();
    }

    public Field getFieldById(Long id){
        return fieldRepository.findOne(id);
    }

    /**
     * FieldOptions Queries
     */

    public List<FieldOption> fieldOptions(){
        return fieldOptionRepository.findAll();
    }

    public FieldOption getFieldOptionById(Long id){
       return fieldOptionRepository.findOne(id);
    }


    /**
     * FieldGroups Queries
     */
    public List<FieldGroup> fieldGroups(){
        return fieldGroupRepository.findAll();
    }

    public FieldGroup getFieldGroupById(Long id){
        return fieldGroupRepository.findOne(id);
    }



}
