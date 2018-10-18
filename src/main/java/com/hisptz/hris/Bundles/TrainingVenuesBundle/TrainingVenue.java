package com.hisptz.hris.Bundles.TrainingVenuesBundle;

import com.hisptz.hris.Bundles.TrainingInstanceBundle.TrainingInstance;
import com.hisptz.hris.core.Model.main.Model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Data;


@Entity
@Table(name = "trainingvenues")
@Data
public class TrainingVenue extends Model {

    @Basic
    @Column(name = "venuename")
    @Size(max = 255)
    private String venueName;

    @Basic
    @Column(name = "region")
    @Size(max = 255)
    private String region;

    @Basic
    @Column(name = "district")
    @Size(max = 255)
    private String district;

    public TrainingVenue(String venueName, String region, String district) {
        super();
        this.venueName = venueName;
        this.region = region;
        this.district = district;
    }
}

