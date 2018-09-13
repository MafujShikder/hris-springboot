package com.hisptz.hris.Bundles.FieldOptionGroup;

import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupMutation extends ModelMutation<FieldOptionGroup> {


    public FieldOptionGroupMutation(FieldOptionGroupRepository fieldOptionGroupRepository, FieldOptionRepository fieldOptionRepository) {
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
        this.fieldOptionRepository = fieldOptionRepository;
    }

    public FieldOptionGroup newFieldOptionGroup(String uid, String name, String description, String operator, Long field, Long fieldOptionId) {
        FieldOptionGroup fieldOptionGroup = new FieldOptionGroup(uid, name, description, operator, field);


        if (fieldOptionId != null)
            fieldOptionGroup.getFieldOptions().add(fieldOptionRepository.getOne(fieldOptionId));

        fieldOptionGroupRepository.save(fieldOptionGroup);
        return fieldOptionGroup;
    }

    public Boolean deleteFieldOptionGroup(Long id){
        return deleteModel(id, fieldOptionGroupRepository);
    }

<<<<<<< HEAD
    public FieldOptionGroup updateFieldOptionGroup(Long id, String uid, String name, String description, String operator, Long field, Long fieldOptionId){
        FieldOptionGroup fieldOptionGroup = fieldOptionGroupRepository.findOne(id);
=======
    public FieldOptionGroup updateFieldOptionGroup(Long id, String uid, String name, String description, String operator, Integer fieldId, Long field, Long fieldOptionId){
        FieldOptionGroup fieldOptionGroup = fieldOptionGroupRepository.getOne(id);
>>>>>>> origin/develop

        if (uid != null)
            fieldOptionGroup.setUid(uid);

        if (name != null)
            fieldOptionGroup.setName(name);

        if (description != null)
            fieldOptionGroup.setDescription(description);


        if (operator != null)
            fieldOptionGroup.setOperator(operator);

        if (field != null)
            fieldOptionGroup.setField(field);

        if (fieldOptionId != null & !fieldOptionGroup.getFieldOptions().contains(fieldOptionRepository.getOne(fieldOptionId)))
            fieldOptionGroup.getFieldOptions().add(fieldOptionRepository.getOne(fieldOptionId));

        fieldOptionGroupRepository.save(fieldOptionGroup);
        return fieldOptionGroup;
    }

}
