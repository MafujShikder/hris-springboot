package com.hisptz.hris.Bundles.TrainingVenuesBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

@Component
public class TrainingVenueMutation extends ModelMutation<TrainingVenue> {
    public TrainingVenueMutation(TrainingVenueRepository trainingVenueRepository) {
        this.trainingVenueRepository = trainingVenueRepository;
    }

    public TrainingVenue newTrainingVenue(String venueName, String region, String district){
        TrainingVenue trainingVenue =  new TrainingVenue(venueName, region, district);
        trainingVenueRepository.save(trainingVenue);

        return trainingVenue;
    }

    public Boolean deleteTrainingVenue(Long id){
        deleteModel(id, trainingVenueRepository);

        return true;
    }

    public TrainingVenue updateTrainingVenue(Long id, String venueName, String region, String district){
        TrainingVenue trainingVenue = trainingVenueRepository.getOne(id);

        if( venueName != null){
            trainingVenue.setVenueName(venueName);
        }

        if( region != null){
            trainingVenue.setRegion(region);
        }

        if(district != null){
            trainingVenue.setDistrict(district);
        }

        trainingVenueRepository.save(trainingVenue);
        return trainingVenue;
    }
}
