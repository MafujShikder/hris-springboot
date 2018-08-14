package com.hisptz.hris.Bundles.RelationalFilter;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/14/18.
 */
@Component
public class RelationalFilterResolver implements GraphQLResolver<RelationalFilter>{
    @Autowired
    private RelationalFilterRepository relationFilterRepository;

    public RelationalFilterResolver(RelationalFilterRepository relationFilterRepository) {
        this.relationFilterRepository = relationFilterRepository;
    }
}
