package com.hisptz.hris.Bundles.TrainingInstanceBundle;

import com.hisptz.hris.Bundles.TrainingBundle.Training;
import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
@Table(name = "traininginstance")
public class TrainingInstance extends Model {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "training_id", nullable = false)
    private Training training;

    @Basic
    @Column(name = "region")
    @Size(max = 255)
    private String region;

    @Basic
    @Column(name = "district")
    @Size(max = 255)
    private String district;

    @Basic
    @Column(name = "venue")
    @Size(max = 255)
    private String venue;

    @Basic
    @Column(name = "sponsor")
    @Size(max = 255)
    private String sponsor;

    @Basic
    @Column(name = "startdate")
    private Timestamp startDate;

    @Basic
    @Column(name = "enddate")
    private Timestamp endDate;
}
