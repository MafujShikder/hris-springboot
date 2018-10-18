package com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrganisationunitGroupsetResolver implements GraphQLResolver<OrganisationunitGroupset> {
    @Autowired
    OrganisationunitGroupsetRepository organisationunitGroupsetRepository;
    public OrganisationunitGroupsetResolver(OrganisationunitGroupsetRepository organisationunitGroupsetRepository){
        this.organisationunitGroupsetRepository = organisationunitGroupsetRepository;
    }
}
