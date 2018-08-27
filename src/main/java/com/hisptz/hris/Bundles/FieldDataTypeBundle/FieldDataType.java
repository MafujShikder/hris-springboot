package com.hisptz.hris.Bundles.FieldDataTypeBundle;

/**
 * Created by Guest on 8/16/18.
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
@Table(name = "field_datatype")
public class FieldDataType  extends Model {
    private String uid;
    private String name;
    private String description;

    public FieldDataType() {
    }

    public FieldDataType(Long id) {
        this.id = id;
    }

    public FieldDataType(String uid, String name, String description) {
        this.uid = uid;
        this.name = name;
        this.description = description;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}