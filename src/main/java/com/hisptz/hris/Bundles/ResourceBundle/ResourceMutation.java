package com.hisptz.hris.Bundles.ResourceBundle;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ResourceMutation extends ModelMutation<Resource>{
    @Autowired
    ResourceRepository resourceRepository;

    public ResourceMutation(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }


    public Resource newResource(String uid, String name, String description, Boolean isgenerating, String messagelog){
        return new Resource(uid, name, description, isgenerating, messagelog);
    }

    public Boolean deleteResource(Long id){
        return deleteModel(id, resourceRepository);
    }

    public Resource updateResource(Long id, String uid, String name, String description, Boolean isgenerating, String messagelog){
        Resource resource = resourceRepository.findOne(id);

        if (uid != null)
            resource.setUid(uid);

        if (name != null)
            resource.setName(name);

        if (description != null)
            resource.setDescription(description);

        if (isgenerating != null)
            resource.setIsgenerating(isgenerating);

        if (messagelog != null)
            resource.setMessagelog(messagelog);

        return resource;
    }
}
