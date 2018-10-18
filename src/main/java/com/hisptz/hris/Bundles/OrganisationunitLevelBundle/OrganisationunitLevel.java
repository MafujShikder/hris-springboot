package com.hisptz.hris.Bundles.OrganisationunitLevelBundle;

//import com.hisptz.hris.Bundles.OrganisationunitStructureBundle.OrganisationunitStructure;
import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "organisationunitlevel")
public class OrganisationunitLevel extends Model {
    @Basic
    @Column(name = "level")
    private int level;

    @Basic
    @Column(name = "name")
    @Size(max = 128)
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "dataentrylevel")
    private boolean dataEntryLevel;

    public OrganisationunitLevel(int level, String name, String description, Boolean dataEntryLevel) {
        super();
        this.level = level;
        this.name = name;
        this.description = description;
        this.dataEntryLevel = dataEntryLevel;
    }
}
