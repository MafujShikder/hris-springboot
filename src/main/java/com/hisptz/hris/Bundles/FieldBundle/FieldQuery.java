package com.hisptz.hris.Bundles.FieldBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.core.Model.ModelQuery;
import com.hisptz.hris.core.Model.ModelRepository;
import com.hisptz.hris.core.Model.ModelSpecification;
import com.hisptz.hris.core.QueryStructure.QueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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


    public List<Field> Field(String where, String sort){
       return query(where, spec, fieldRepository, sort);
    }

}
