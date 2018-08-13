package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldMutation implements GraphQLMutationResolver {
    @Autowired
    protected FieldRepository fieldRepository;

    public FieldMutation(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    public Field newField(Integer datatypeId, Integer inputtypeId, String uid, String name, String caption, Boolean compulsory, Boolean isunique, Boolean iscalculated, String description, String calculatedexpression, Boolean hashistory, Boolean hastarget, Boolean fieldrelation, Boolean skipinreport) {
        Field field = new Field(datatypeId, inputtypeId, uid, name, caption, compulsory, isunique, iscalculated, description, calculatedexpression, hashistory, hastarget, fieldrelation, skipinreport);

        fieldRepository.save(field);
        return field;
    }

    public Boolean deleteField(Long id) {
        fieldRepository.delete(fieldRepository.findOne(id));
        return true;
    }

    public Field updateField(Long id, Integer datatypeId, Integer inputtypeId, String uid, String name, String caption, Boolean compulsory, Boolean isunique, Boolean iscalculated, String description, String calculatedexpression, Boolean hashistory, Boolean hastarget, Boolean fieldrelation, Boolean skipinreport) {
        Field field = fieldRepository.findOne(id);

        if (datatypeId != null)
            field.setDatatypeId(datatypeId);

        if (inputtypeId != null)
            field.setInputtypeId(inputtypeId);

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

//        if (parent_id != null)
//            field.setParentField(fieldRepository.getOne(parent_id));

        fieldRepository.save(field);
        return field;
    }

}
