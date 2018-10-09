package com.hisptz.hris.Bundles.OrganisationunitGroupBundle;

import com.hisptz.hris.core.Model.main.Model;
import com.hisptz.hris.Bundles.OrganisationunitGroupsetBundle.OrganisationunitGroupset;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Organisationunitgroup")
@Data
public class OrganisationunitGroup extends Model {
   @OneToOne(fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "organisationunitgroupset_id", nullable = false)
    private OrganisationunitGroupset organisationunitGroupset;


    @Basic
    @Column(name = "name")
    @Size(max = 64)
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "dhisuid")
    @Size(max = 11)
    private String dhisuid;

    @Basic
    @Column(name = "code")
    @Size(max = 50)
    private String code;


}
