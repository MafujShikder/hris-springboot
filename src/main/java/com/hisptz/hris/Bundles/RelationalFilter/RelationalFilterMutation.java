package com.hisptz.hris.Bundles.RelationalFilter;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hisptz.hris.core.Model.ModelMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class RelationalFilterMutation extends ModelMutation<RelationalFilter> {
    @Autowired
    protected RelationalFilterRepository relationalFilterRepository;

    public RelationalFilterMutation(RelationalFilterRepository RelationalFilterRepository) {
        this.relationalFilterRepository = RelationalFilterRepository;
    }


    public RelationalFilter newRelationalFilter(Integer fieldId, String uid, String name, Boolean excludefieldoptions, Long field){
        RelationalFilter relationalFilter = new RelationalFilter(fieldId, uid, name, excludefieldoptions, field);

        relationalFilterRepository.save(relationalFilter);
        return relationalFilter;
    }

    public Boolean deleteRelationalFilter(Long id){
        return deleteModel(id, relationalFilterRepository);
    }

    public RelationalFilter updateRelationalFilter(Long id, Integer fieldId, String uid, String name, Boolean excludefieldoptions, Long field){
        RelationalFilter relationalFilter = relationalFilterRepository.findOne(id);

        if (fieldId != null)
            relationalFilter.setFieldId(fieldId);

        if (uid != null)
            relationalFilter.setUid(uid);

        if (name != null)
            relationalFilter.setName(name);

        if (excludefieldoptions != null)
            relationalFilter.setExcludefieldoptions(excludefieldoptions);

        if (field != null)
            relationalFilter.setField(field);

        return relationalFilter;
    }


}
