package com.hisptz.hris.Bundles.FieldOptionBundle;

/**
 * Created by Guest on 8/10/18.
 */
import com.hisptz.hris.Bundles.FieldBundle.Field;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "fieldoption")
public class FieldOption{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer fieldId;
    private String uid;
    private String value;
    private Boolean skipinreport;
    private String description;
    private Integer sort;
    private Boolean hastraining;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date datecreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastupdated;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Field field;


    public FieldOption() {
    }

    public FieldOption(Integer fieldId, String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining) {
        this.fieldId = fieldId;
        this.uid = uid;
        this.value = value;
        this.skipinreport = skipinreport;
        this.description = description;
        this.sort = sort;
        this.hastraining = hastraining;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
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
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    @Basic
    @Column(name = "hastraining")
    public Boolean getHastraining() {
        return hastraining;
    }

    public void setHastraining(Boolean hastraining) {
        this.hastraining = hastraining;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldOption that = (FieldOption) o;
        return id == that.id &&
                fieldId == that.fieldId &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(value, that.value) &&
                Objects.equals(skipinreport, that.skipinreport) &&
                Objects.equals(description, that.description) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(hastraining, that.hastraining);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldId, uid, value, skipinreport, description, sort, datecreated, lastupdated, hastraining);
    }
}