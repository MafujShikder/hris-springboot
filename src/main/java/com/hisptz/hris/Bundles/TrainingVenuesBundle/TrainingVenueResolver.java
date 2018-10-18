package com.hisptz.hris.Bundles.TrainingVenuesBundle;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingVenueResolver implements GraphQLResolver<TrainingVenue> {
    @Autowired
    TrainingVenueRepository trainingVenueRepository;

    public TrainingVenueResolver(TrainingVenueRepository trainingVenueRepository) {
        this.trainingVenueRepository = trainingVenueRepository;
    }
}
