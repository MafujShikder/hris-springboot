package com.hisptz.hris.Bundles.FieldOptionBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroup;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroupRepository;
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

    @Autowired
    private FieldOptionGroupRepository fieldOptionGroupRepository;

    public FieldOptionMutation(FieldOptionRepository fieldOptionRepository, FieldRepository fieldRepository, FieldOptionGroupRepository fieldOptionGroupRepository) {
        this.fieldOptionRepository = fieldOptionRepository;
        this.fieldRepository = fieldRepository;
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
    }

    public FieldOption newFieldOption(Integer fieldId, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining, Long field, Long fieldOptionGroup) {
        FieldOption fieldOption = new FieldOption(fieldId, uid, value, skipinreport, description, sort, hastraining);

        if (field != null)
         fieldOption.setField(fieldRepository.findOne(field));

        if (fieldOptionGroup != null)
            fieldOption.getFieldOptionGroups().add(fieldOptionGroupRepository.findOne(fieldOptionGroup));

        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

    public Boolean deleteFieldOption(Long id) {
        return deleteModel(id, fieldOptionRepository);
    }

    public FieldOption updateFieldOption(Long id, Integer fieldId, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining, Long fieldOptionGroup) {
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

        if (fieldOptionGroup != null)
            fieldOption.getFieldOptionGroups().add(fieldOptionGroupRepository.findOne(fieldOptionGroup));

        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

}
