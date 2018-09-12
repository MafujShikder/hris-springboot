package com.hisptz.hris.Bundles.FieldOptionGroupSetBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupSetMutation extends ModelMutation<FieldOptionGroupSet>{

    public FieldOptionGroupSetMutation(FieldOptionGroupSetRepository fieldOptionGroupSetRepository) {
        this.fieldOptionGroupSetRepository = fieldOptionGroupSetRepository;
    }

    public FieldOptionGroupSet newFieldOptionGroupSet(String uid, String name, String description) {
        FieldOptionGroupSet fieldOptionGroupSet = new FieldOptionGroupSet(uid, name, description);

        fieldOptionGroupSetRepository.save(fieldOptionGroupSet);
        return fieldOptionGroupSet;
    }

    public Boolean deleteFieldOptionGroupSet(Long id){
       return deleteModel(id, fieldOptionGroupSetRepository);
    }

    public FieldOptionGroupSet updateFieldOptionGroupSet(Long id, String uid, String name, String description){
        FieldOptionGroupSet fieldOptionGroupSet = fieldOptionGroupSetRepository.getOne(id);

        if (uid != null)
            fieldOptionGroupSet.setUid(uid);

        if (name != null)
            fieldOptionGroupSet.setName(name);

        if (description != null)
            fieldOptionGroupSet.setDescription(description);

        fieldOptionGroupSetRepository.save(fieldOptionGroupSet);
        return fieldOptionGroupSet;
    }
}
