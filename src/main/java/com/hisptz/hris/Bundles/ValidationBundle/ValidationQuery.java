package com.hisptz.hris.Bundles.ValidationBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ValidationQuery extends ModelQuery<Validation> {
    @Autowired
    ValidationRepository validationRepository;

    private ModelSpecification<Validation> spec;

    public ValidationQuery(ValidationRepository validationRepository) {
        this.validationRepository = validationRepository;
    }

    public Validation getValidationById(Long id){
        return validationRepository.getOne(id);
    }

    public List<Validation> Validation (String where, String sort){
        return query(where, spec, validationRepository, sort);
    }
}
