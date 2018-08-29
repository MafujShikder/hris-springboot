package com.hisptz.hris.Bundles.FormSectionBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormSectionMutation extends ModelMutation<FormSection> {

    public FormSectionMutation(FormSectionRepository formSectionRepository) {
        this.formSectionRepository = formSectionRepository;
    }

    public FormSection newFormSection(Integer formId, String uid, String name, String description){
        FormSection formSection = new FormSection(formId, uid, name, description);

        formSectionRepository.save(formSection);
        return formSection;
    }

    public Boolean deleteFormSection(Long id){
        return deleteModel(id, formSectionRepository);
    }

    public FormSection updateFormSection(Long id,Integer formId,String uid, String name, String description){
        FormSection formSection = formSectionRepository.findOne(id);

        if (uid != null)
            formSection.setUid(uid);

        if (name != null)
            formSection.setName(name);

        if (description != null)
            formSection.setDescription(description);

        if (formId != null)
            formSection.setFormId(formId);

        return formSection;
    }
}
