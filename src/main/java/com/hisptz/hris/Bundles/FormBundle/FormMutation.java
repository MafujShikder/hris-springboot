package com.hisptz.hris.Bundles.FormBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormMutation extends ModelMutation<Form>{

    public FormMutation(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public Form newForm(String uid, String name, String hypertext, String title){
        Form form = new Form(uid, name, hypertext, title);

        formRepository.save(form);
        return form;
    }

    public Boolean deleteForm(Long id){
        return deleteModel(id, formRepository);
    }

    public Form updateForm(Long id, String uid, String name, String hypertext, String title){
        Form form = formRepository.findOne(id);

        if (uid != null)
            form.setUid(uid);

        if (name != null)
            form.setName(name);

        if (hypertext != null)
            form.setHypertext(hypertext);

        if (title != null)
            form.setTitle(title);

        return form;
    }
}
