package com.hisptz.hris.Bundles.FieldOptionGroup;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupMutation extends ModelMutation<FieldOptionGroup> {
    @Autowired
    protected FieldOptionGroupRepository fieldOptionGroupRepository;

    public FieldOptionGroupMutation(FieldOptionGroupRepository fieldOptionGroupRepository) {
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
    }

    public FieldOptionGroup newFieldOptionGroup(String uid, String name, String description, Integer fieldId, String operator, Long field) {
        FieldOptionGroup fieldOptionGroup = new FieldOptionGroup(fieldId,uid, name, description, operator, field);

        fieldOptionGroupRepository.save(fieldOptionGroup);
        return fieldOptionGroup;
    }

    public Boolean deleteFieldOptionGroup(Long id){
        return deleteModel(id, fieldOptionGroupRepository);
    }

    public FieldOptionGroup updateFieldOptionGroup(Long id, String uid, String name, String description, String operator, Integer fieldId, Long field){
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

        if (field != null)
            fieldOptionGroup.setField(field);

        fieldOptionGroupRepository.save(fieldOptionGroup);
        return fieldOptionGroup;
    }

}
