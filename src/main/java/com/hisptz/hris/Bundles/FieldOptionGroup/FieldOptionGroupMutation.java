package com.hisptz.hris.Bundles.FieldOptionGroup;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupMutation implements GraphQLMutationResolver {
    @Autowired
    protected FieldOptionGroupRepository fieldOptionGroupRepository;

    public FieldOptionGroupMutation(FieldOptionGroupRepository fieldOptionGroupRepository) {
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
    }

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
