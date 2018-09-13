package com.hisptz.hris.Bundles.FieldBundle;

import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroupRepository;
import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldMutation extends ModelMutation<Field> {

    public FieldMutation(FieldRepository fieldRepository, FieldGroupRepository fieldGroupRepository) {
        this.fieldRepository = fieldRepository;
        this.fieldGroupRepository = fieldGroupRepository;
    }

    public Field newField(String uid, String name, String caption, Boolean compulsory, Boolean isunique, Boolean iscalculated, String description, String calculatedexpression, Boolean hashistory, Boolean hastarget, Boolean fieldrelation, Boolean skipinreport, Long inputType, Long fieldGroup) {
        Field field = new Field( uid, name, caption, compulsory, isunique, iscalculated, description, calculatedexpression, hashistory, hastarget, fieldrelation, skipinreport, inputType);

        if (fieldGroup != null)
            field.getFieldGroups().add(fieldGroupRepository.getOne(fieldGroup));

        fieldRepository.save(field);
        return field;
    }

    public Boolean deleteField(Long id) {
       return deleteModel(id, fieldRepository);
    }

    public Field updateField(Long id, String uid, String name, String caption, Boolean compulsory, Boolean isunique, Boolean iscalculated, String description, String calculatedexpression, Boolean hashistory, Boolean hastarget, Boolean fieldrelation, Boolean skipinreport, Long inputType, Long fieldGroup) {
        Field field = fieldRepository.getOne(id);


        if (uid != null)
            field.setUid(uid);

        if (name != null)
            field.setName(name);

        if (caption != null)
            field.setCaption(name);

        if (compulsory != null)
            field.setCompulsory(compulsory);

        if (isunique != null)
            field.setIsunique(isunique);

        if (iscalculated != null)
            field.setIscalculated(iscalculated);

        if (description != null)
            field.setDescription(description);

        if (calculatedexpression != null)
            field.setCalculatedexpression(calculatedexpression);

        if (hashistory != null)
            field.setHashistory(hashistory);

        if (hastarget != null)
            field.setHastarget(hastarget);

        if (fieldrelation != null)
            field.setFieldrelation(fieldrelation);

        if (skipinreport != null)
            field.setSkipinreport(skipinreport);

        if (inputType != null)
            field.setInputType(inputType);


        if (fieldGroup != null)
            field.getFieldGroups().add(fieldGroupRepository.getOne(fieldGroup));

        fieldRepository.save(field);
        return field;
    }

}
