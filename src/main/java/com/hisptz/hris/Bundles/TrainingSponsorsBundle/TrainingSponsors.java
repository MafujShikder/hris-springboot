package com.hisptz.hris.Bundles.TrainingSponsorsBundle;

import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "trainingsponsors")
@Data
public class TrainingSponsors extends Model {
    @Basic
    @Column(name = "sponsorname")
    @Size(max = 255)
    private String sponsorName;

    @Basic
    @Column(name = "region")
    @Size(max = 255)
    private String region;

    @Basic
    @Column(name = "phone")
    @Size(max = 255)
    private String phone;

    @Basic
    @Column(name = "email")
    @Size(max = 255)
    private String email;

    @Basic
    @Column(name = "box")
    @Size(max = 255)
    private String box;
}
