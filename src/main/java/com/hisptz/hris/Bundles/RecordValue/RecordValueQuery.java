package com.hisptz.hris.Bundles.RecordValue;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/29/18.
 */
@Component
public class RecordValueQuery extends ModelQuery<RecordValue>{
    private ModelSpecification<RecordValue> spec;

    public RecordValueQuery(RecordValueRepository recordValueRepository) {
        this.recordValueRepository = recordValueRepository;
    }

    public List<RecordValue> RecordValue(String where, String sort){
        return query(where, spec, recordValueRepository, sort);
    }
}
