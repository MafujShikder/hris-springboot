package com.hisptz.hris.Bundles.TrainingInstanceBundle;

import com.hisptz.hris.Bundles.TrainingBundle.Training;
import com.hisptz.hris.Bundles.TrainingSponsorsBundle.TrainingSponsors;
import com.hisptz.hris.Bundles.TrainingVenuesBundle.TrainingVenue;
import com.hisptz.hris.core.Model.main.Model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;


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

    //add a relationship with trainingvenue table
    // @Basic
    // @Column(name = "venue")
    // @Size(max = 255)
    // private String venue;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "venue", nullable= false)
    private TrainingVenue trainingVenue;

    //add a relationship with trainingsponsors table
//    @Basic
//    @Column(name = "sponsor")
//    @Size(max = 255)
//    private String sponsor;

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
