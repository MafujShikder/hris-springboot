package com.hisptz.hris.Bundles.FieldOptionBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionMutation extends ModelMutation<FieldOption> {
    @Autowired
    protected FieldOptionRepository fieldOptionRepository;

    @Autowired
    private FieldRepository fieldRepository;

    public FieldOptionMutation(FieldOptionRepository fieldOptionRepository, FieldRepository fieldRepository) {
        this.fieldOptionRepository = fieldOptionRepository;
        this.fieldRepository = fieldRepository;
    }

    public FieldOption newFieldOption(Integer fieldId, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining, Long field) {
        FieldOption fieldOption = new FieldOption(fieldId, uid, value, skipinreport, description, sort, hastraining);

        fieldOption.setField(new Field(field));
        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

    public Boolean deleteFieldOption(Long id) {
        return deleteModel(id, fieldOptionRepository);
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
