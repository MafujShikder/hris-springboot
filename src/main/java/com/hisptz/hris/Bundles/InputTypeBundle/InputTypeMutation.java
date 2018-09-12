package com.hisptz.hris.Bundles.InputTypeBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class InputTypeMutation extends ModelMutation<InputType>{


    public InputTypeMutation(InputTypeRepository inputTypeRepository) {
        this.inputTypeRepository = inputTypeRepository;
    }


    public InputType newInputType(String uid, String name, String description, String htmltag){
        InputType inputType = new InputType(uid, name, description, htmltag);

        inputTypeRepository.save(inputType);
        return inputType;
    }

    public Boolean deleteInputType(Long id){
        return deleteModel(id, inputTypeRepository);
    }

    public InputType updateInputType(Long id,String uid, String name, String description, String htmltag){
        InputType inputType = inputTypeRepository.getOne(id);

        if (uid != null)
            inputType.setUid(uid);

        if (name != null)
            inputType.setName(name);

        if (description != null)
            inputType.setDescription(description);

        if (htmltag != null)
            inputType.setHtmltag(htmltag);

        return inputType;
    }
}































