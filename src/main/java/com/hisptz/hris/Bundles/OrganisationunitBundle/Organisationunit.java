package com.hisptz.hris.Bundles.OrganisationunitBundle;

import com.hisptz.hris.Bundles.OrganisationunitCompletenessBundle.OrganisationunitCompleteness;
import com.hisptz.hris.Bundles.OrganisationunitGroupBundle.OrganisationunitGroup;
import com.hisptz.hris.core.Model.main.Model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Data;


@Entity
@Table(name = "organisationunit")
@Data
public class Organisationunit extends Model {
    @Basic
    @Column(name = "parent_id")
    private String parentId;

    @Basic
    @Size(max = 11)
    @Column(name = "dhisuid")
    private String dhisUid;


    @Basic
    @Column(name = "code")
    @Size(max = 25)
    private String code;

    @Basic
    @Size(max = 20)
    @Column(name = "shortname")
    private String shortName;

    @Basic
    @Size(max = 64)
    @Column(name = "longname")
    private  String longName;

    @Basic
    @Column(name = "active")
    private boolean active;

    @Basic
    @Column (name = "openingdate")
    private Date openingDate;

    @Basic
    @Column(name = "closingdate")
    private Date closingDate;

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
    private String featureType;

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
    private String contactPerson;

    @Basic
    @Column(name = "description")
    private String description;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "organisationunit")
    private OrganisationunitCompleteness organisationunitCompleteness;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "organisationunit")
    private Set<OrganisationunitGroup> organisationunitGroup = new HashSet<OrganisationunitGroup>();

    public Organisationunit(String parentId, String dhisUid, String code,  String shortName, String longName, boolean active, Date openingDate, Date closingDate, String geaocode, String coordinates, String featureType, String address, String email, String phonenumber, String contactPerson, String description) {
        super();
        this.parentId = parentId;
        this.dhisUid = dhisUid;
        this.code = code;
        this.shortName = shortName;
        this.longName = longName;
        this.active = active;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.geaocode = geaocode;
        this.coordinates = coordinates;
        this.featureType = featureType;
        this.address = address;
        this.email = email;
        this.phonenumber = phonenumber;
        this.contactPerson = contactPerson;
        this.description = description;
    }
}