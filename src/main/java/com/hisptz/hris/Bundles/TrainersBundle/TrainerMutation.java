package com.hisptz.hris.Bundles.TrainersBundle;

import com.hisptz.hris.core.Model.main.ModelMutation;
import org.springframework.stereotype.Component;

@Component
public class TrainerMutation extends ModelMutation<Trainer> {
    public TrainerMutation(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public Trainer newTrainer(String firstName, String middleName, String lastName, String primaryJobResponsibility,
            String secondaryJobResponsibility, String profession, String currentJobTitle, String placeOfWork,
            String organisationType, String trainerType, String trainerLanguage, String trainerAffiliation,
            String experience, String highestLevelOfQualification) {
        Trainer trainer = new Trainer(firstName, middleName, lastName, primaryJobResponsibility,
                secondaryJobResponsibility, profession, currentJobTitle, placeOfWork, organisationType, trainerType,
                trainerLanguage, trainerAffiliation, experience, highestLevelOfQualification);

        trainerRepository.save(trainer);
        return trainer;
    }

    public Boolean deleteTrainer(Long id) {
        deleteModel(id, trainerRepository);

        return true;
    }

    public Trainer updateTrainer(Long id, String firstName, String middleName, String lastName,
            String primaryJobResponsibility, String secondaryJobResponsibility, String profession,
            String currentJobTitle, String placeOfWork, String organisationType, String trainerType,
            String trainerLanguage, String trainerAffiliation, String experience, String highestLevelOfQualification) {
        Trainer trainer = trainerRepository.getOne(id);

        if (firstName != null) {
            trainer.setFirstName(firstName);
        }

        if (middleName != null) {
            trainer.setMiddleName(middleName);
        }

        if (lastName != null) {
            trainer.setLastName(lastName);
        }

        if (primaryJobResponsibility != null) {
            trainer.setPrimaryJobResponsibility(primaryJobResponsibility);
        }

        if (secondaryJobResponsibility != null) {
            trainer.setSecondaryJobResponsibility(secondaryJobResponsibility);
        }

        if (profession != null) {
            trainer.setProfession(profession);
        }

        if (currentJobTitle != null) {
            trainer.setCurrentJobTitle(currentJobTitle);
        }

        if (placeOfWork != null) {
            trainer.setPlaceOfWork(placeOfWork);
        }

        if (organisationType != null) {
            trainer.setOrganisationType(organisationType);
        }

        if (trainerType != null) {
            trainer.setTrainerType(trainerType);
        }

        if (trainerAffiliation != null) {
            trainer.setTrainerAffiliation(trainerAffiliation);
        }

        if (trainerLanguage != null) {
            trainer.setTrainerLanguage(trainerLanguage);
        }

        if (experience != null) {
            trainer.setExperience(experience);
        }

        if (highestLevelOfQualification != null) {
            trainer.setHighestLevelOfQualification(highestLevelOfQualification);
        }

        trainerRepository.save(trainer);
        return trainer;
    }
}
