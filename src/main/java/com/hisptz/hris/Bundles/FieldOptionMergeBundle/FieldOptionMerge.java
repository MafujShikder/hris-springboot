package com.hisptz.hris.Bundles.FieldOptionMergeBundle;

/**
 * Created by Guest on 8/16/18.
 */
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "fieldoptionmerge")
public class FieldOptionMerge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer fieldId;
    private Integer mergedfieldoptionId;
    private String uid;
    private String removedfieldoptionvalue;
    private String removedfieldoptionuid;
    
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date datecreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastupdated;

    public FieldOptionMerge() {
    }

    public FieldOptionMerge(Long id) {
        this.id = id;
    }

    public FieldOptionMerge(Integer fieldId, Integer mergedfieldoptionId, String uid, String removedfieldoptionvalue, String removedfieldoptionuid) {
        this.fieldId = fieldId;
        this.mergedfieldoptionId = mergedfieldoptionId;
        this.uid = uid;
        this.removedfieldoptionvalue = removedfieldoptionvalue;
        this.removedfieldoptionuid = removedfieldoptionuid;
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
    @Column(name = "field_id")
    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    @Basic
    @Column(name = "mergedfieldoption_id")
    public Integer getMergedfieldoptionId() {
        return mergedfieldoptionId;
    }

    public void setMergedfieldoptionId(Integer mergedfieldoptionId) {
        this.mergedfieldoptionId = mergedfieldoptionId;
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
    @Column(name = "removedfieldoptionvalue")
    public String getRemovedfieldoptionvalue() {
        return removedfieldoptionvalue;
    }

    public void setRemovedfieldoptionvalue(String removedfieldoptionvalue) {
        this.removedfieldoptionvalue = removedfieldoptionvalue;
    }

    @Basic
    @Column(name = "removedfieldoptionuid")
    public String getRemovedfieldoptionuid() {
        return removedfieldoptionuid;
    }

    public void setRemovedfieldoptionuid(String removedfieldoptionuid) {
        this.removedfieldoptionuid = removedfieldoptionuid;
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
        FieldOptionMerge that = (FieldOptionMerge) o;
        return id == that.id &&
                Objects.equals(fieldId, that.fieldId) &&
                Objects.equals(mergedfieldoptionId, that.mergedfieldoptionId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(removedfieldoptionvalue, that.removedfieldoptionvalue) &&
                Objects.equals(removedfieldoptionuid, that.removedfieldoptionuid) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldId, mergedfieldoptionId, uid, removedfieldoptionvalue, removedfieldoptionuid, datecreated, lastupdated);
    }
}
