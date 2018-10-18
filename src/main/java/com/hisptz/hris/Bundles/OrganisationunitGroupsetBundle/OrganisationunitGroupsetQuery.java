package com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrganisationunitGroupsetQuery extends ModelQuery<OrganisationunitGroupset> {
    @Autowired
    OrganisationunitGroupsetRepository organisationunitGroupsetRepository;

    private ModelSpecification<OrganisationunitGroupset> spec;

    public OrganisationunitGroupsetQuery(OrganisationunitGroupsetRepository organisationunitGroupsetRepository) {
        this.organisationunitGroupsetRepository = organisationunitGroupsetRepository;
    }

    public OrganisationunitGroupset getOrganisationunitGroupsetById(Long id){
        return organisationunitGroupsetRepository.getOne(id);
    }

    public List<OrganisationunitGroupset> OrganisationunitGroupset(String where, String sort){
        return query(where, spec, organisationunitGroupsetRepository, sort);
    }
}
