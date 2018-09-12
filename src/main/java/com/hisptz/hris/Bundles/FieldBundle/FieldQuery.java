package com.hisptz.hris.Bundles.FieldBundle;

import com.hisptz.hris.core.Model.main.ModelQuery;
import com.hisptz.hris.core.Model.common.ModelSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/13/18.
 */
@Component
public class FieldQuery extends ModelQuery<Field>{
    @Autowired
    protected FieldRepository fieldRepository;
    private ModelSpecification<Field> spec;

    public FieldQuery(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    public Field getFieldById(Long id){
        return fieldRepository.findOne(id);
    }


    public List<Field> Fields(String where, String sort){
       return query(where, spec, fieldRepository, sort);
    }

}
