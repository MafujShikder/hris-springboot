package com.hisptz.hris.Bundles.TrainersBundle;

import com.hisptz.hris.core.Model.main.Model;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Data;


@Entity
@Table(name = "trainers")
@Data
public class Trainer extends Model {
    @Basic
    @Column(name = "firstname")
    @Size(max =255)
    private String firstName;

    @Basic
    @Column(name = "middlename")
    @Size(max =255)
    private String middleName;

    @Basic
    @Column(name = "lastname")
    @Size(max =255)
    private String lastName;

    @Basic
    @Column(name = "primaryjobresponsibility")
    @Size(max =255)
    private String primaryJobResponsibility;

    @Basic
    @Column(name = "secondaryjobresponsibility")
    @Size(max =255)
    private String secondaryJobResponsibility;

    @Basic
    @Column(name = "profession")
    @Size(max =255)
    private String profession;

    @Basic
    @Column(name = "currentjobtitle")
    @Size(max =255)
    private String currentJobTitle;

    @Basic
    @Column(name = "placeofwork")
    @Size(max =255)
    private String placeOfWork;

    @Basic
    @Column(name = "organisationtype")
    @Size(max =255)
    private String organisationType;

    @Basic
    @Column(name = "trainertype")
    @Size(max =255)
    private String trainerType;

    @Basic
    @Column(name = "trainerlanguage")
    @Size(max =255)
    private String trainerLanguage;

    @Basic
    @Column(name = "traineraffiliation")
    @Size(max =255)
    private String trainerAffiliation;

    @Basic
    @Column(name = "experience")
    @Size(max =255)
    private String experience;

    @Basic
    @Column(name = "highestlevelofqualification")
    @Size(max =255)
    private String highestLevelOfQualification;

}
