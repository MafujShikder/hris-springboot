package com.hisptz.hris.Bundles.RecordBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/29/18.
 */
@Component
public class RecordMutation extends ModelMutation<Record>{

    public RecordMutation(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }
    
    public Record newRecord(Long organisationunitId, Long formId, String instance, Boolean complete, Boolean correct, Boolean hasHistory, Boolean hasTraining, String username){
        Record record = new Record(organisationunitId, formId, instance, complete, correct, hasHistory, hasTraining, username);

        recordRepository.save(record);
        return record;
    }

    public Boolean deleteRecord(Long id){
        deleteModel(id, recordRepository);
        return true;
    }

    public Record updateRecord(Long id, Long organisationunitId, Long formId, String instance, Boolean complete, Boolean correct, Boolean hasHistory, Boolean hasTraining, String username){
        Record record = recordRepository.getOne(id);

        if (organisationunitId != null)
            record.setOrganisationunitId(organisationunitId);

        if (formId != null)
            record.setFormId(formId);

        if (instance != null)
            record.setInstance(instance);

        if (complete != null)
            record.setComplete(complete);

        if (correct != null)
            record.setCorrect(correct);

        if (hasHistory != null)
            record.setHasHistory(hasHistory);

        if (hasTraining != null)
            record.setHasHistory(hasHistory);

        if (username != null)
            record.setUsername(username);

        recordRepository.save(record);
        return record;
    }

}
