package com.hisptz.hris.Bundles.TrainingInstanceBundle;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hisptz.hris.Bundles.TrainingBundle.Training;
import com.hisptz.hris.Bundles.TrainingSponsorsBundle.TrainingSponsors;
import com.hisptz.hris.Bundles.TrainingVenuesBundle.TrainingVenue;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "traininginstance")
@Data
public class TrainingInstance extends Model {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "training_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Training training;

    @Basic
    @Column(name = "region")
    @Size(max = 255)
    private String region;

    @Basic
    @Column(name = "district")
    @Size(max = 255)
    private String district;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "venue", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private TrainingVenue trainingVenue;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "traininginstance_sponsors",
        joinColumns = {@JoinColumn(name = "traininginstance_id")},
        inverseJoinColumns = {@JoinColumn(name = "trainingsponsors_id")})
    private Set<TrainingSponsors> trainingSponsors = new HashSet<TrainingSponsors>();

    @Basic
    @Column(name = "startdate")
    private Date startDate;

    @Basic
    @Column(name = "enddate")
    private Date endDate;
}
