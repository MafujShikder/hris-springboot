package com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle;

import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import com.hisptz.hris.Bundles.OrganisationunitGroupBundle.OrganisationunitGroup;

@Entity
@Table(name = "organisationgroupset")
public class OrganisationunitGroupset extends Model {
    @Basic
    @Column(name = "dhisuid")
    @Size(max = 11)
    private String dhisuid;

    @Basic
    @Column(name = "name")
    @Size(max = 64)
    private  String name;

    @Basic
    @Column(name = "description")
    @Size(max = 255)
    private String description;

    @Basic
    @Column(name = "compulsory")
    private boolean compulsory;

    @Basic
    @Column(name = "code")
    @Size(max = 50)
    private String code;

    @OneToOne(fetch =  FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "organisationunitGroupset")
    private OrganisationunitGroup organisationunitGroup;

}
