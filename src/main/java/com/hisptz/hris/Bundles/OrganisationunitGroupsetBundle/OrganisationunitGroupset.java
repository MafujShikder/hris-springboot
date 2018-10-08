package com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle;

import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

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
}
