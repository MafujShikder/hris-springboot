package com.hisptz.hris.Bundles.TrainingBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

@Component
public class TrainingMutation extends ModelMutation<Training> {
    public TrainingMutation(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public Training newTraining(String courseName, String trainingCategory, String trainingInstruction,
            String curriculum) {
        Training training = new Training(courseName, trainingCategory, trainingInstruction, curriculum);
        trainingRepository.save(training);

        return training;
    }

    public Boolean deleteTraining(Long id) {
        deleteModel(id, trainingRepository);

        return true;
    }

    public Training updateTraining(Long id, String courseName, String trainingCategory, String trainingInstruction,
            String curriculum) {
        Training training = trainingRepository.getOne(id);

        if (courseName != null) {
            training.setCourseName(courseName);
        }

        if (trainingCategory != null) {
            training.setTrainingCategory(trainingCategory);
        }

        if (trainingInstruction != null) {
            training.setTrainingInstruction(trainingInstruction);
        }

        if (curriculum != null) {
            training.setCurriculum(curriculum);
        }

        trainingRepository.save(training);
        return training;
    }
}
