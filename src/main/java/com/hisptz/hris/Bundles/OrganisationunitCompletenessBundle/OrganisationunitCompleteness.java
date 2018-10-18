package com.hisptz.hris.Bundles.OrganisationunitCompletenessBundle;


import com.hisptz.hris.Bundles.OrganisationunitBundle.Organisationunit;
import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.*;

@Entity
@Table(name = "organisationunitcompleteness")
public class OrganisationunitCompleteness extends Model {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "organisationunit_id", nullable = false)
    private Organisationunit organisationunit;

    @Basic
    @Column(name = "form_id")
    private int formId;

    @Basic
    @Column(name = "expectation")
    private int expectation;

    public OrganisationunitCompleteness(int formId, int expectation) {
        super();
        this.formId = formId;
        this.expectation = expectation;
    }
}


