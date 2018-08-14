package com.hisptz.hris.Bundles.FormBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class FormMutation implements GraphQLMutationResolver{
    @Autowired
    private FormRepository formRepository;

    public FormMutation(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public Form newForm(String uid, String name, String hypertext, String title){
        return new Form(uid, name, hypertext, title);
    }

    public Boolean deleteForm(Long id){
        formRepository.delete(formRepository.findOne(id));
        return true;
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
