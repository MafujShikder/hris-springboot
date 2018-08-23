package com.hisptz.hris.Bundles.RelationalFilter;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldBundle.FieldRepository;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class RelationalFilterResolver implements GraphQLResolver<RelationalFilter>{
    @Autowired
    private RelationalFilterRepository relationFilterRepository;

    @Autowired
    private FieldRepository fieldRepository;

    public RelationalFilterResolver(RelationalFilterRepository relationFilterRepository, FieldRepository fieldRepository) {
        this.relationFilterRepository = relationFilterRepository;
        this.fieldRepository = fieldRepository;
    }

    public Field getField(RelationalFilter relationalFilter){
        return fieldRepository.findOne(relationalFilter.getField().getId());
    }

}
