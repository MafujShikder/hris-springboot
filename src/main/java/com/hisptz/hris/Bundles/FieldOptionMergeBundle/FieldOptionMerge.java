package com.hisptz.hris.Bundles.FieldOptionMergeBundle;

/**
 * Created by Guest on 8/16/18.
 */
import com.hisptz.hris.core.Model.Model;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "fieldoptionmerge")
public class FieldOptionMerge extends Model {
    private Integer fieldId;
    private Integer mergedfieldoptionId;
    private String uid;
    private String removedfieldoptionvalue;
    private String removedfieldoptionuid;

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

}
