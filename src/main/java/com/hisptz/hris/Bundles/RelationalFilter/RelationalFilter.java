package com.hisptz.hris.Bundles.RelationalFilter;

/**
 * Created by Guest on 8/14/18.
 */
import com.hisptz.hris.core.Model.Model;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public RelationalFilter() {
    }

    public RelationalFilter(Integer fieldId, String uid, String name, Boolean excludefieldoptions) {
        this.fieldId = fieldId;
        this.uid = uid;
        this.name = name;
        this.excludefieldoptions = excludefieldoptions;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelationalFilter that = (RelationalFilter) o;
        return id == that.id &&
                excludefieldoptions == that.excludefieldoptions &&
                Objects.equals(fieldId, that.fieldId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldId, uid, name, excludefieldoptions, datecreated, lastupdated);
    }
}