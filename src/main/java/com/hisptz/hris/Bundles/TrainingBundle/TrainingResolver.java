package com.hisptz.hris.Bundles.TrainingBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingResolver implements GraphQLResolver<Training> {
    @Autowired
    TrainingRepository trainingRepository;

    public TrainingResolver(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }
}
