package com.hisptz.hris.Bundles.RecordBundle;

import com.hisptz.hris.Bundles.InputTypeBundle.InputType;
import com.hisptz.hris.Bundles.RecordValue.RecordValue;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelSpecification;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/29/18.
 */
@Component
public class RecordQuery extends ModelQuery<Record>{
    private ModelSpecification<Record> spec;

    public RecordQuery(RecordRepository recordRepository) {
       this.recordRepository = recordRepository;
    }

    public List<Record> Record(String where, String sort){
        return query(where, spec, recordRepository, sort);
    }

}
