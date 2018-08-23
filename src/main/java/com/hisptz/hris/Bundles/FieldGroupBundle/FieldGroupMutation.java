package com.hisptz.hris.Bundles.FieldGroupBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Guest on 8/13/18.
 */

@Component
public class FieldGroupMutation extends ModelMutation<FieldGroup> {
    @Autowired
    protected FieldGroupRepository fieldGroupRepository;

    @Autowired
    private FieldRepository fieldRepository;

    public FieldGroupMutation(FieldGroupRepository fieldGroupRepository, FieldRepository fieldRepository) {
        this.fieldGroupRepository = fieldGroupRepository;
        this.fieldRepository = fieldRepository;
    }

    public FieldGroup newFieldGroup(String uid, String name, String description, Long field) {
        FieldGroup fieldGroup = new FieldGroup(uid, name, description);

        if (field != null) {
            fieldGroup.getFields().add(fieldRepository.findOne(field));
        }

        fieldGroupRepository.save(fieldGroup);
        return fieldGroup;
    }

    public Boolean deleteFieldGroup(Long id) {
        return deleteModel(id, fieldGroupRepository);
    }

    public FieldGroup updateFieldGroup(Long id, String uid, String name, String description, Long field) {
        FieldGroup fieldGroup = fieldGroupRepository.findOne(id);

        if (uid != null)
            fieldGroup.setUid(uid);

        if (name != null)
            fieldGroup.setName(name);

        if (description != null)
            fieldGroup.setDescription(description);

        if (field != null) {
            fieldGroup.getFields().add(fieldRepository.findOne(field));
        }

        fieldGroupRepository.save(fieldGroup);
        return fieldGroup;
    }

}
