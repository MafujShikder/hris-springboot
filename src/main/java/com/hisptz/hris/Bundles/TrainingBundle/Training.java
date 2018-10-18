package com.hisptz.hris.Bundles.TrainingBundle;

import com.hisptz.hris.Bundles.TrainingInstanceBundle.TrainingInstance;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "trainings")
@Data
public class Training extends Model {
    @Basic
    @Column(name = "coursename")
    @Size(max = 255)
    private String courseName;

    @Basic
    @Column(name = "trainingcategory")
    @Size(max = 255)
    private String trainingCategory;

    @Basic
    @Column(name = "traininginstruction")
    @Size(max = 255)
    private String trainingInstruction;

    @Basic
    @Column(name = "curiculum")
    @Size(max = 64)
    private String curiculum;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "training")
    private TrainingInstance trainingInstance;

    public Training( String courseName,  String trainingCategory,  String trainingInstruction, String curiculum) {
        super();
        this.courseName = courseName;
        this.trainingCategory = trainingCategory;
        this.trainingInstruction = trainingInstruction;
        this.curiculum = curiculum;
    }
}
