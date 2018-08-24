package com.hisptz.hris.Bundles.RelationalFilter;

/**
 * Created by Guest on 8/14/18.
 */
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.core.Model.Model;
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
@Table(name = "relationalfilter")
public class RelationalFilter extends Model {

    private Integer fieldId;
    private String uid;
    private String name;
    private Boolean excludefieldoptions;

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


    public RelationalFilter() {
    }

    public RelationalFilter(Integer fieldId, String uid, String name, Boolean excludefieldoptions, Long field) {
        this.fieldId = fieldId;
        this.uid = uid;
        this.name = name;
        this.excludefieldoptions = excludefieldoptions;
        this.field = new Field(field);
    }

    public Field getField() {
        return field;
    }

    public void setField(Long field) {
        this.field = new Field(field);
    }

    public Boolean getExcludefieldoptions() {
        return excludefieldoptions;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "excludefieldoptions")
    public Boolean isExcludefieldoptions() {
        return excludefieldoptions;
    }

    public void setExcludefieldoptions(Boolean excludefieldoptions) {
        this.excludefieldoptions = excludefieldoptions;
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

}