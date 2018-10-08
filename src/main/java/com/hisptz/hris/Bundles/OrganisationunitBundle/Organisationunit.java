package com.hisptz.hris.Bundles.OrganisationunitBundle;

import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
@Table(name = "organisationunit", schema = "public", catalog = "hrhis")
@Data
public class Organisationunit extends Model {
    @Basic
    @Column(name = "parent_id")
    private String parentId;

    @Basic
    @Size(max = 11)
    @Column(name = "dhisuid")
    private String dhisuid;


    @Basic
    @Column(name = "code")
    @Size(max = 25)
    private String code;

    @Basic
    @Size(max = 20)
    @Column(name = "shortname")
    private String shortman;

    @Basic
    @Size(max = 64)
    @Column(name = "longname")
    private  String longname;

    @Basic
    @Column(name = "active")
    private boolean active;

    @Basic
    @Column (name = "openingdate")
    private Date openingdate;

    @Basic
    @Column(name = "closingdate")
    private Date closingdate;

    @Basic
    @Size(max = 255)
    @Column(name = "geocode")
    private String geaocode;

    @Basic
    @Size(max = 11)
    @Column (name = "coordinates")
    private String coordinates;

    @Basic
    @Size(max = 20)
    @Column(name = "featuretype")
    private String featureTYpe;

    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Size(max = 150)
    @Column(name = "email")
    private String email;

    @Basic
    @Size(max = 150)
    @Column(name = "phonenumber")
    private String phonenumber;

    @Basic
    @Size(max = 150)
    @Column(name = "contactperson")
    private String contactperson;

    @Basic
    @Column(name = "description")
    private String description;
}