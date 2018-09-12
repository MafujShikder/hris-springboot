package com.hisptz.hris.Bundles.FieldOptionBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldOptionQuery extends ModelQuery<FieldOption>{
    @Autowired
    protected FieldOptionRepository fieldOptionRepository;

    private ModelSpecification<FieldOption> spec;

    public FieldOptionQuery(FieldOptionRepository fieldOptionRepository) {
        this.fieldOptionRepository = fieldOptionRepository;
    }

    public FieldOption getFieldOptionById(Long id){
        return fieldOptionRepository.getOne(id);
    }

    public List<FieldOption> FieldOptions(String where, String sort){
        return query(where, spec, fieldOptionRepository, sort);
    }
}
