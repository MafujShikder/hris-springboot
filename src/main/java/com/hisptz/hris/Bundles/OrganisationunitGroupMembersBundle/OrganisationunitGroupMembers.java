package com.hisptz.hris.Bundles.OrganisationunitGroupMembersBundle;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "organisationunitgroup_members")
public class OrganisationunitGroupMembers {

    //to place a relationship with orgunitGroup
    @Id
    @Basic
    @Column(name = "organisationunitgroup_id")
    private int organisationunitGroupId;

    //to place a relationship with orgunit
    @Basic
    @Column(name="organisationunit_id")
    private int getOrganisationunitId;
}
