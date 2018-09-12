package com.hisptz.hris.Bundles.RelationalFilter;

import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOptionRepository;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReportRepository;
import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class RelationalFilterMutation extends ModelMutation<RelationalFilter> {

    public RelationalFilterMutation(RelationalFilterRepository RelationalFilterRepository, FieldOptionRepository fieldOptionRepository, FriendlyReportRepository friendlyReportRepository) {
        this.relationalFilterRepository = RelationalFilterRepository;
        this.fieldOptionRepository = fieldOptionRepository;
        this.friendlyReportRepository = friendlyReportRepository;
    }


    public RelationalFilter newRelationalFilter(Integer fieldId, String uid, String name, Boolean excludefieldoptions, Long field, Long fieldOptionId, Long friendlyReportId){
        RelationalFilter relationalFilter = new RelationalFilter(fieldId, uid, name, excludefieldoptions, field);

        if (fieldOptionId != null)
            relationalFilter.getFieldOptions().add(fieldOptionRepository.getOne(fieldOptionId));

        if (friendlyReportId != null)
            relationalFilter.getFriendlyReports().add(friendlyReportRepository.getOne(friendlyReportId));

        relationalFilterRepository.save(relationalFilter);
        return relationalFilter;
    }

    public Boolean deleteRelationalFilter(Long id){
        return deleteModel(id, relationalFilterRepository);
    }

    public RelationalFilter updateRelationalFilter(Long id, Integer fieldId, String uid, String name, Boolean excludefieldoptions, Long field, Long fieldOptionId, Long friendlyReportId){
        RelationalFilter relationalFilter = relationalFilterRepository.getOne(id);

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

        if (fieldOptionId != null)
            relationalFilter.getFieldOptions().add(fieldOptionRepository.getOne(fieldOptionId));

        if (friendlyReportId != null)
            relationalFilter.getFriendlyReports().add(friendlyReportRepository.getOne(friendlyReportId));
        return relationalFilter;
    }


}
