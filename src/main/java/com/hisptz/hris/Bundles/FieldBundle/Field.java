package com.hisptz.hris.Bundles.FieldBundle;

/**
 * Created by Guest on 8/10/18.
 */

import com.hisptz.hris.Bundles.DataTypeBundle.DataType;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroup;
import com.hisptz.hris.Bundles.InputTypeBundle.InputType;
import com.hisptz.hris.core.Model.Model;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "field")
public class Field extends Model{
    private Integer datatypeId;
    private Integer inputtypeId;
    private String name;
    private String caption;
    private Boolean compulsory;
    private Boolean isunique;
    private Boolean iscalculated;
    private String description;
    private String calculatedexpression;
    private Boolean hashistory;
    private Boolean hastarget;
    private Boolean fieldrelation;
    private Boolean skipinreport;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            })
    @JoinTable(name = "FieldGroupFieldMembers",
            joinColumns = { @JoinColumn(name = "field_id") },
            inverseJoinColumns = { @JoinColumn(name = "fieldgroup_id") })
    private Set<FieldGroup> fieldGroups = new HashSet<>();;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inputtype", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private InputType inputType;


    public Set<FieldGroup> getFieldGroups() {
        return fieldGroups;
    }

    public void setFieldGroups(Set<FieldGroup> fieldGroups) {
        this.fieldGroups = fieldGroups;
    }

    public Field() {
        super();
    }

    public Field(Long id) {
        super();
        this.id = id;
    }

    public Field(Integer datatypeId, Integer inputtypeId, String uid, String name, String caption, Boolean compulsory, Boolean isunique, Boolean iscalculated, String description, String calculatedexpression, Boolean hashistory, Boolean hastarget, Boolean fieldrelation, Boolean skipinreport, Long inputTypeId) {
        super();
        this.datatypeId = datatypeId;
        this.inputtypeId = inputtypeId;
        this.name = name;
        this.caption = caption;
        this.compulsory = compulsory;
        this.isunique = isunique;
        this.iscalculated = iscalculated;
        this.description = description;
        this.calculatedexpression = calculatedexpression;
        this.hashistory = hashistory;
        this.hastarget = hastarget;
        this.fieldrelation = fieldrelation;
        this.skipinreport = skipinreport;
        this.inputType = new InputType(inputTypeId);
    }

    public InputType getInputType() {
        return inputType;
    }

    public void setInputType(Long id) {
        this.inputType = new InputType(id);
    }


    @Basic
    @Column(name = "datatype_id")
    public Integer getDatatypeId() {
        return datatypeId;
    }

    public void setDatatypeId(Integer datatypeId) {
        this.datatypeId = datatypeId;
    }

    @Basic
    @Column(name = "inputtype_id")
    public Integer getInputtypeId() {
        return inputtypeId;
    }

    public void setInputtypeId(Integer inputtypeId) {
        this.inputtypeId = inputtypeId;
    }

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "caption")
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Basic
    @Column(name = "compulsory")
    public Boolean getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(Boolean compulsory) {
        this.compulsory = compulsory;
    }

    @Basic
    @Column(name = "isunique")
    public Boolean getIsunique() {
        return isunique;
    }

    public void setIsunique(Boolean isunique) {
        this.isunique = isunique;
    }

    @Basic
    @Column(name = "iscalculated")
    public Boolean getIscalculated() {
        return iscalculated;
    }

    public void setIscalculated(Boolean iscalculated) {
        this.iscalculated = iscalculated;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "calculatedexpression")
    public String getCalculatedexpression() {
        return calculatedexpression;
    }

    public void setCalculatedexpression(String calculatedexpression) {
        this.calculatedexpression = calculatedexpression;
    }

    @Basic
    @Column(name = "hashistory")
    public Boolean getHashistory() {
        return hashistory;
    }

    public void setHashistory(Boolean hashistory) {
        this.hashistory = hashistory;
    }

    @Basic
    @Column(name = "hastarget")
    public Boolean getHastarget() {
        return hastarget;
    }

    public void setHastarget(Boolean hastarget) {
        this.hastarget = hastarget;
    }

    @Basic
    @Column(name = "fieldrelation")
    public Boolean getFieldrelation() {
        return fieldrelation;
    }

    public void setFieldrelation(Boolean fieldrelation) {
        this.fieldrelation = fieldrelation;
    }

    @Basic
    @Column(name = "skipinreport")
    public Boolean getSkipinreport() {
        return skipinreport;
    }

    public void setSkipinreport(Boolean skipinreport) {
        this.skipinreport = skipinreport;
    }

}