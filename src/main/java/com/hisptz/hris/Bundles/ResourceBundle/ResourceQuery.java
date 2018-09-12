package com.hisptz.hris.Bundles.ResourceBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class ResourceQuery extends ModelQuery<Resource>{
    @Autowired
    ResourceRepository resourceRepository;

    private ModelSpecification<Resource> spec;

    public ResourceQuery(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public Resource getResourceById(Long id){
        return resourceRepository.getOne(id);
    }

    public List<Resource> Resources(String where, String sort){
        return query(where, spec, resourceRepository, sort);
    }
}
