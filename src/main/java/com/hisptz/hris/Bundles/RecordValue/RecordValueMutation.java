package com.hisptz.hris.Bundles.RecordValue;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/29/18.
 */
@Component
public class RecordValueMutation extends ModelMutation<RecordValue>{

    public RecordValueMutation(RecordValueRepository recordValueRepository) {
        this.recordValueRepository = recordValueRepository;
    }

    public RecordValue newRecordValue(Long recordId, Long fieldId, String value){
        RecordValue recordValue = new RecordValue(value);

        if (recordId != null)
            recordValue.setRecord(recordRepository.findOne(recordId));

        if (fieldId != null)
            recordValue.setField(fieldRepository.findOne(fieldId));

        recordValueRepository.save(recordValue);
        return recordValue;
    }

    public Boolean deleteRecordValue(Long id){
        deleteModel(id, recordValueRepository);

        return true;
    }

   public RecordValue updateRecordValue(Long id, Long recordId, Long fieldId, String value){
       RecordValue recordValue = recordValueRepository.findOne(id);

       if (value != null)
           recordValue.setValue(value);

       if (recordId != null)
           recordValue.setRecord(recordRepository.findOne(recordId));

       if (fieldId != null)
           recordValue.setField(fieldRepository.findOne(fieldId));

       recordValueRepository.save(recordValue);
       return recordValue;
   }

}
