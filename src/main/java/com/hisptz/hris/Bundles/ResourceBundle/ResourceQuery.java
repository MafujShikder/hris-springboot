package com.hisptz.hris.Bundles.ResourceBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ResourceQuery implements GraphQLQueryResolver{
    @Autowired
    ResourceRepository resourceRepository;

    public ResourceQuery(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public List<Resource> resources(){
        return resourceRepository.findAll();
    }

    public Resource getResourceById(Long id){
        return resourceRepository.findOne(id);
    }
}
