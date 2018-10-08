package com.hisptz.hris.Bundles.OrganisationunitLevelBundle;

import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "organisationunitlevel")
public class OrganisationunitLevel extends Model {
    @Basic
    @Column(name = "level")
    private int level;

    @Basic
    @Column(name = "name")
    @Size(max = 128)
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "dataentrylevel")
    private boolean dataEntryLevel;

}
