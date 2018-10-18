package com.hisptz.hris.Bundles.OrganisationunitLevelBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrganisationunitLevelQuery extends ModelQuery<OrganisationunitLevel> {
    @Autowired
    OrganisationunitLevelRepository organisationunitLevelRepository;

    private ModelSpecification<OrganisationunitLevel> spec;

    public OrganisationunitLevelQuery(OrganisationunitLevelRepository organisationunitLevelRepository) {
        this.organisationunitLevelRepository = organisationunitLevelRepository;
    }

    public  OrganisationunitLevel getOrganisationUnitLevelById(Long id){
        return organisationunitLevelRepository.getOne(id);
    }

    public List<OrganisationunitLevel> OrganisationunitLevel(String where, String sort){
        return query(where, spec, organisationunitLevelRepository, sort);
    }
}

