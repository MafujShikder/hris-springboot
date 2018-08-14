package com.hisptz.hris.Bundles.DataTypeBundle;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Guest on 8/14/18.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "datatype")
public class DataType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uid;
    private String name;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastUpdated;

    public DataType() {
    }

    public DataType(String uid, String name, String description) {
        this.uid = uid;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
