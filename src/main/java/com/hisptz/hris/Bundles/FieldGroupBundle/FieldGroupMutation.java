package com.hisptz.hris.Bundles.FieldGroupBundle;

import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */

@Component
public class FieldGroupMutation extends ModelMutation<FieldGroup> {

    public FieldGroupMutation(FieldGroupRepository fieldGroupRepository, FieldRepository fieldRepository) {
        this.fieldGroupRepository = fieldGroupRepository;
        this.fieldRepository = fieldRepository;
    }

    public FieldGroup newFieldGroup(String uid, String name, String description, Long field) {
        FieldGroup fieldGroup = new FieldGroup(uid, name, description);

        if (field != null) {
            fieldGroup.getFields().add(fieldRepository.getOne(field));
        }

        fieldGroupRepository.save(fieldGroup);
        return fieldGroup;
    }

    public Boolean deleteFieldGroup(Long id) {
        return deleteModel(id, fieldGroupRepository);
    }

    public FieldGroup updateFieldGroup(Long id, String uid, String name, String description, Long field) {
        FieldGroup fieldGroup = fieldGroupRepository.getOne(id);

        if (uid != null)
            fieldGroup.setUid(uid);

        if (name != null)
            fieldGroup.setName(name);

        if (description != null)
            fieldGroup.setDescription(description);

        //if (field != null) {
            fieldGroup.getFields().add(fieldRepository.getOne(field));
        //}

        fieldGroupRepository.save(fieldGroup);
        return fieldGroup;
    }

}
