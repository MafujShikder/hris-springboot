package com.hisptz.hris.Bundles.TrainersBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainerResolver implements GraphQLResolver<Trainer> {
    @Autowired
    TrainerRepository trainerRepository;

    public TrainerResolver(TrainerRepository trainerRepository){
        this.trainerRepository = trainerRepository;
    }
}
