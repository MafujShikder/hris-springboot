package com.hisptz.hris.Bundles.TrainingBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrainingQuery extends ModelQuery<Training> {
    @Autowired
    TrainingRepository trainingRepository;

    private ModelSpecification<Training> spec;

    public TrainingQuery(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public Training getTrainingById(Long id){
        return trainingRepository.getOne(id);
    }

    public List<Training> Training(String where, String sort){
        return query(where, spec, trainingRepository, sort);
    }
}
