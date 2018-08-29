package com.hisptz.hris.Bundles.RecordBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.RecordValue.RecordValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/29/18.
 */
@Component
public class RecordResolver implements GraphQLResolver<Record>{
    @Autowired
    RecordValueRepository recordValueRepository;

    @Autowired
    RecordRepository recordRepository;

    public RecordResolver(RecordValueRepository recordValueRepository, RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
        this.recordValueRepository = recordValueRepository;
    }
}
