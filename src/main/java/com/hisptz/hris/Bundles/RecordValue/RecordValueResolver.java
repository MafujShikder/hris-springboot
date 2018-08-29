package com.hisptz.hris.Bundles.RecordValue;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.hisptz.hris.Bundles.RecordBundle.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Guest on 8/29/18.
 */
@Component
public class RecordValueResolver implements GraphQLResolver<RecordValue>{
    @Autowired
    RecordValueRepository recordValueRepository;

    @Autowired
    RecordRepository recordRepository;

    public RecordValueResolver(RecordRepository recordRepository, RecordValueRepository recordValueRepository) {
        this.recordRepository = recordRepository;
        this.recordValueRepository = recordValueRepository;
    }
}
