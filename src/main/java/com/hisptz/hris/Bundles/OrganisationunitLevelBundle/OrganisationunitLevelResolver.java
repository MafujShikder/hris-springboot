package com.hisptz.hris.Bundles.OrganisationunitLevelBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrganisationunitLevelResolver implements GraphQLResolver<OrganisationunitLevel> {
    @Autowired
    OrganisationunitLevelRepository organisationunitLevelRepository;

    public OrganisationunitLevelResolver(OrganisationunitLevelRepository organisationunitLevelRepository){
        this.organisationunitLevelRepository = organisationunitLevelRepository;
    }
}
