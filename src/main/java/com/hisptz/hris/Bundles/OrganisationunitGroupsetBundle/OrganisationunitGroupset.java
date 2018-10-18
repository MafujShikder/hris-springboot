package com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle;

import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import com.hisptz.hris.Bundles.OrganisationunitGroupBundle.OrganisationunitGroup;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    public OrganisationunitGroupset(String dhisuid, String name, String description, Boolean compulsory,  String code) {
        super();
        this.dhisuid = dhisuid;
        this.name = name;
        this.description = description;
        this.compulsory = compulsory;
        this.code = code;
    }
}
