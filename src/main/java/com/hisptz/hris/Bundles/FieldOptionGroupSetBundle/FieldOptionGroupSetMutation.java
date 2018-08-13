package com.hisptz.hris.Bundles.FieldOptionGroupSetBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionGroupSetMutation implements GraphQLMutationResolver {
    @Autowired
    protected FieldOptionGroupSetRepository fieldOptionGroupSetRepository;

    public FieldOptionGroupSetMutation(FieldOptionGroupSetRepository fieldOptionGroupSetRepository) {
        this.fieldOptionGroupSetRepository = fieldOptionGroupSetRepository;
    }

    public FieldOptionGroupSet newFieldOptionGroupSet(String uid, String name, String description) {
        FieldOptionGroupSet fieldOptionGroupSet = new FieldOptionGroupSet(uid, name, description);

        fieldOptionGroupSetRepository.save(fieldOptionGroupSet);
        return fieldOptionGroupSet;
    }

    public Boolean deleteFieldOptionGroupSet(Long id){
        fieldOptionGroupSetRepository.delete(fieldOptionGroupSetRepository.findOne(id));
        return true;
    }

    public FieldOptionGroupSet updateFieldOptionGroupSet(Long id, String uid, String name, String description){
        FieldOptionGroupSet fieldOptionGroupSet = fieldOptionGroupSetRepository.findOne(id);

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
