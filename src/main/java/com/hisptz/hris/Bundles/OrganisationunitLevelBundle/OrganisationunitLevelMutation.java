package com.hisptz.hris.Bundles.OrganisationunitLevelBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

@Component
public class OrganisationunitLevelMutation extends ModelMutation<OrganisationunitLevel> {

    public OrganisationunitLevelMutation(OrganisationunitLevelRepository organisationunitLevelRepository){
        this.organisationunitLevelRepository = organisationunitLevelRepository;
    }

    public OrganisationunitLevel newOrganisationunitLevel(Integer level, String name, String description, Boolean dataEntryLevel){
        OrganisationunitLevel organisationunitLevel = new OrganisationunitLevel(level, name, description, dataEntryLevel);
        organisationunitLevelRepository.save(organisationunitLevel);

        return organisationunitLevel;
    }

    public Boolean deleteOrganisationLevel(Long id){
        deleteModel(id, organisationunitLevelRepository);
        return true;
    }

    public OrganisationunitLevel updateorganisationunitLevel(Long id, Integer level, String name, String description, Boolean dataEntryLevel){
        OrganisationunitLevel organisationunitLevel = organisationunitLevelRepository.getOne(id);

        if(level != null){
            organisationunitLevel.setLevel(level);
        }

        if( name != null){
            organisationunitLevel.setName(name);
        }

        if(description != null){
            organisationunitLevel.setDescription(description);
        }

        if(dataEntryLevel != null){
            organisationunitLevel.setDataEntryLevel(dataEntryLevel);
        }


        return organisationunitLevel;
    }
}
