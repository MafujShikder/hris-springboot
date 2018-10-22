package com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

@Component
public class OrganisationunitGroupsetMutation extends ModelMutation<OrganisationunitGroupset> {
    public OrganisationunitGroupsetMutation(OrganisationunitGroupsetRepository organisationunitGroupsetRepository){
        this.organisationunitGroupsetRepository = organisationunitGroupsetRepository;
    }

    public OrganisationunitGroupset newOrganisationunitGroupset(String dhisUid, String name, String description, Boolean compulsory,  String code){
        OrganisationunitGroupset organisationunitGroupset = new OrganisationunitGroupset(dhisUid, name, description, compulsory, code);
        organisationunitGroupsetRepository.save(organisationunitGroupset);

        return organisationunitGroupset;
    }

    public Boolean deleteOrganisationunitGroupset(Long id){
        deleteModel(id, organisationunitGroupsetRepository);
        return true;
    }

    public OrganisationunitGroupset updateOrganisationunitGroupset(Long id, String dhisUid, String name, String description, Boolean compulsory,  String code){
        OrganisationunitGroupset organisationunitGroupset = organisationunitGroupsetRepository.getOne(id);
        if(dhisUid != null){
            organisationunitGroupset.setDhisUid(dhisUid);
        }

        if(name != null){
            organisationunitGroupset.setName(name);
        }

        if(description != null){
            organisationunitGroupset.setDescription(description);
        }

        if(compulsory != null){
            organisationunitGroupset.setCompulsory(compulsory);
        }

        if(code != null){
            organisationunitGroupset.setCode(code);
        }

        return organisationunitGroupset;
    }
}
