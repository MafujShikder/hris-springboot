package com.hisptz.hris.Bundles.TrainingVenuesBundle;

import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

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
}

