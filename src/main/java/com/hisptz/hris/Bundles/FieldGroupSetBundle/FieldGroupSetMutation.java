package com.hisptz.hris.Bundles.FieldGroupSetBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldGroupSetMutation implements GraphQLMutationResolver {
    @Autowired
    protected FieldGroupSetRepository fieldGroupSetRepository;

    public FieldGroupSetMutation(FieldGroupSetRepository fieldGroupSetRepository) {
        this.fieldGroupSetRepository = fieldGroupSetRepository;
    }

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

}
