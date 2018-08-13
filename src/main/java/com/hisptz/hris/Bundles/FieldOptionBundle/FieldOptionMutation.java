package com.hisptz.hris.Bundles.FieldOptionBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionMutation implements GraphQLMutationResolver {
    @Autowired
    protected FieldOptionRepository fieldOptionRepository;

    public FieldOptionMutation(FieldOptionRepository fieldOptionRepository) {
        this.fieldOptionRepository = fieldOptionRepository;
    }

    public FieldOption newFieldOption(Integer fieldId, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining) {
        FieldOption fieldOption = new FieldOption(fieldId, uid, value, skipinreport, description, sort, hastraining);

        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

    public Boolean deleteFieldOption(Long id) {
        fieldOptionRepository.delete(fieldOptionRepository.findOne(id));
        return true;
    }

    public FieldOption updateFieldOption(Long id, Integer fieldId, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining) {
        FieldOption fieldOption = fieldOptionRepository.findOne(id);

        if (fieldId != null)
            fieldOption.setFieldId(fieldId);

        if (uid != null)
            fieldOption.setUid(uid);

        if (value != null)
            fieldOption.setValue(value);

        if (skipinreport != null)
            fieldOption.setSkipinreport(skipinreport);

        if (description != null)
            fieldOption.setDescription(description);

        if (sort != null)
            fieldOption.setSort(sort);

        if (hastraining != null)
            fieldOption.setHastraining(hastraining);

        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

}
