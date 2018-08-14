package com.hisptz.hris.Bundles.ResourceBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ResourceResolver implements GraphQLResolver<Resource>{
    @Autowired
    private ResourceRepository resourceRepository;

    public ResourceResolver(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }
}
