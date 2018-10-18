package com.hisptz.hris.Bundles.TrainersBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrainerQuery extends ModelQuery<Trainer> {
    @Autowired
    TrainerRepository trainerRepository;

    private ModelSpecification<Trainer> spec;

    public TrainerQuery(TrainerRepository trainerRepository){
        this.trainerRepository = trainerRepository;
    }

    public Trainer getTrainerById(Long id){
        return trainerRepository.getOne(id);
    }

    public List<Trainer> Trainer(String where, String sort){
        return query(where, spec, trainerRepository, sort);
    }
}
