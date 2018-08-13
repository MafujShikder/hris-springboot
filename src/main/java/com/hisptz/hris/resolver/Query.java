package com.hisptz.hris.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
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
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSet;
import com.hisptz.hris.Bundles.FieldOptionGroupSetBundle.FieldOptionGroupSetRepository;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.Bundles.UserBundle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/7/18.
 */
@Component
public class Query extends Resolver implements GraphQLQueryResolver {


    public Query(UserRepository userRepository, FieldRepository fieldRepository, FieldOptionRepository fieldOptionRepository, FieldGroupRepository fieldGroupRepository, FieldGroupSetRepository fieldGroupSetRepository, FieldOptionGroupRepository fieldOptionGroupRepository, FieldOptionGroupSetRepository fieldOptionGroupSetRepository) {
        super(userRepository, fieldRepository, fieldOptionRepository, fieldGroupRepository, fieldGroupSetRepository, fieldOptionGroupRepository, fieldOptionGroupSetRepository);
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

    /**
     * FieldGroupSets Queries
     */
    public List<FieldGroupSet> fieldGroupSets(){
        return fieldGroupSetRepository.findAll();
    }

    public FieldGroupSet getFieldGroupSetsById(Long id){
        return fieldGroupSetRepository.findOne(id);
    }

    /**
     * FieldOptionGroup Queries
     */
    public List<FieldOptionGroup> fieldOptionGroups(){
        return fieldOptionGroupRepository.findAll();
    }

    public FieldOptionGroup getFieldOptionGroupById(Long id){
        return fieldOptionGroupRepository.findOne(id);
    }

    /**
     * FieldOptionGroupSets Queries
     */

    public List<FieldOptionGroupSet> fieldOptionGroupSets(){
        return fieldOptionGroupSetRepository.findAll();
    }

    public FieldOptionGroupSet getFieldOptionGroupSetById(Long id){
        return fieldOptionGroupSetRepository.findOne(id);
    }
}
