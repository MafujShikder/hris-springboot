package com.hisptz.hris.Bundles.OrganisationunitCompletenessBundle;


import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.*;

@Entity
@Table(name = "organisationunitcompleteness")
public class OrganisationunitCompleteness extends Model {

    //here to place a relationship
    @Basic
    @Column(name = "organisationunit_id")
    private int organisationunitId;

    @Basic
    @Column(name = "form_id")
    private int formId;

    @Basic
    @Column(name = "expectation")
    private int expectation;
}


