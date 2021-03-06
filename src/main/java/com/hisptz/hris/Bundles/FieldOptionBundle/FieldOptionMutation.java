package com.hisptz.hris.Bundles.FieldOptionBundle;

import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroupRepository;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilterRepository;
import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionMutation extends ModelMutation<FieldOption> {

    public FieldOptionMutation(FieldOptionRepository fieldOptionRepository, FieldRepository fieldRepository, FieldOptionGroupRepository fieldOptionGroupRepository, RelationalFilterRepository relationalFilterRepository) {
        this.fieldOptionRepository = fieldOptionRepository;
        this.fieldRepository = fieldRepository;
        this.fieldOptionGroupRepository = fieldOptionGroupRepository;
        this.relationalFilterRepository = relationalFilterRepository;
    }

    public FieldOption newFieldOption( String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining, Long field, Long fieldOptionGroup, Long relationalFilterId) {
        FieldOption fieldOption = new FieldOption( uid, value, skipinreport, description, sort, hastraining);

        if (field != null)
         fieldOption.setField(fieldRepository.getOne(field));

        if (fieldOptionGroup != null)
            fieldOption.getFieldOptionGroups().add(fieldOptionGroupRepository.getOne(fieldOptionGroup));

        if (relationalFilterId != null)
            fieldOption.getRelationalFilters().add(relationalFilterRepository.getOne(relationalFilterId));


        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

    public Boolean deleteFieldOption(Long id) {
        return deleteModel(id, fieldOptionRepository);
    }


    public FieldOption updateFieldOption(Long id, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining, Long fieldOptionGroup,  Long relationalFilterId) {
        FieldOption fieldOption = fieldOptionRepository.getOne(id);


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
            fieldOption.getFieldOptionGroups().add(fieldOptionGroupRepository.getOne(fieldOptionGroup));

        if (relationalFilterId != null & !fieldOption.getRelationalFilters().contains(relationalFilterRepository.getOne(relationalFilterId)))
            fieldOption.getRelationalFilters().add(relationalFilterRepository.getOne(relationalFilterId));

        fieldOptionRepository.save(fieldOption);
        return fieldOption;
    }

}
