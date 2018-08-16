package com.hisptz.hris.Bundles.FieldBundle;

/**
 * Created by Guest on 8/10/18.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hisptz.hris.Bundles.FieldGroupBundle.FieldGroup;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "field")
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer datatypeId;
    private Integer inputtypeId;
    private String uid;
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
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "FieldGroupFieldMembers",
            joinColumns = { @JoinColumn(name = "field_id") },
            inverseJoinColumns = { @JoinColumn(name = "fieldgroup_id") })
    private List<FieldGroup> fieldGroups = new ArrayList<>();

    public List<FieldGroup> getFieldGroups() {
        return fieldGroups;
    }

    public void setFieldGroups(List<FieldGroup> fieldGroups) {
        this.fieldGroups = fieldGroups;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date datecreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastupdated;

    public Field() {
    }

    public Field(Long id) {
        this.id = id;
    }
    public Field(Integer datatypeId, Integer inputtypeId, String uid, String name, String caption, Boolean compulsory, Boolean isunique, Boolean iscalculated, String description, String calculatedexpression, Boolean hashistory, Boolean hastarget, Boolean fieldrelation, Boolean skipinreport) {
        this.datatypeId = datatypeId;
        this.inputtypeId = inputtypeId;
        this.uid = uid;
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
    }

    @Basic
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Basic
    @Column(name = "datecreated")
    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    @Basic
    @Column(name = "lastupdated")
    public Date getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field that = (Field) o;
        return id == that.id &&
                Objects.equals(datatypeId, that.datatypeId) &&
                Objects.equals(inputtypeId, that.inputtypeId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(compulsory, that.compulsory) &&
                Objects.equals(isunique, that.isunique) &&
                Objects.equals(iscalculated, that.iscalculated) &&
                Objects.equals(description, that.description) &&
                Objects.equals(calculatedexpression, that.calculatedexpression) &&
                Objects.equals(hashistory, that.hashistory) &&
                Objects.equals(hastarget, that.hastarget) &&
                Objects.equals(fieldrelation, that.fieldrelation) &&
                Objects.equals(skipinreport, that.skipinreport) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, datatypeId, inputtypeId, uid, name, caption, compulsory, isunique, iscalculated, description, calculatedexpression, hashistory, hastarget, fieldrelation, skipinreport, datecreated, lastupdated);
    }
}