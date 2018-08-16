package com.hisptz.hris.Bundles.FieldOptionMergeBundle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Guest on 8/16/18.
 */
@Component
public class FieldOptionMergeQuery implements GraphQLQueryResolver {
    @Autowired
    private FieldOptionMergeRepository fieldOptionMergeRepository;

    public FieldOptionMergeQuery(FieldOptionMergeRepository fieldOptionMergeRepository) {
        this.fieldOptionMergeRepository = fieldOptionMergeRepository;
    }


    public List<FieldOptionMerge> fieldOptionMerges(){
        return fieldOptionMergeRepository.findAll();
    }

    public FieldOptionMerge getFieldOptionMergeById(Long id){
        return fieldOptionMergeRepository.findOne(id);
    }

}
