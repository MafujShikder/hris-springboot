package com.hisptz.hris.Bundles.TrainingVenuesBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrainingVenueQuery extends ModelQuery<TrainingVenue> {
    @Autowired
    TrainingVenueRepository trainingVenueRepository;

    private ModelSpecification<TrainingVenue> spec;

    public TrainingVenueQuery(TrainingVenueRepository trainingVenueRepository) {
        this.trainingVenueRepository = trainingVenueRepository;
    }

    public TrainingVenue getTrainingVenueById(Long id){
        return trainingVenueRepository.getOne(id);
    }

    public List<TrainingVenue> TrainingVenue(String where, String sort){
        return  query(where, spec, trainingVenueRepository, sort);
    }
}
