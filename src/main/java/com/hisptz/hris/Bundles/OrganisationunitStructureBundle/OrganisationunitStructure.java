package com.hisptz.hris.Bundles.OrganisationunitStructureBundle;


import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "organisationunitstructure")
public class OrganisationunitStructure extends Model {
    //to have a relationship with the orgunit
    @Basic
    @Column(name = "organisationunit_id")
    private int organisationunitId;

    @Basic
    @Column(name = "level_id")
    private int levelId;

    @Basic
    @Column(name = "level1_id")
    private int level1Id;

    @Basic
    @Column(name = "level2_id")
    private int level2Id;

    @Basic
    @Column(name = "level3_id")
    private int level3Id;

    @Basic
    @Column(name = "level4_id")
    private int level4Id;

    @Basic
    @Column(name = "level5_id")
    private int level5Id;

    @Basic
    @Column(name = "level6_id")
    private int level6Id;

}

