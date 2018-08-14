package com.hisptz.hris.Bundles.ResourceBundle;

/**
 * Created by Guest on 8/14/18.
 */
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String uid;
    private String name;
    private String description;
    private Boolean isgenerating;
    
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date datecreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastupdated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastgenerated;

    private String messagelog;


    public Resource() {
    }

    public Resource(String uid, String name, String description, Boolean isgenerating, String messagelog) {
        this.uid = uid;
        this.name = name;
        this.description = description;
        this.isgenerating = isgenerating;
        this.messagelog = messagelog;
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

    @Basic
    @Column(name = "isgenerating")
    public Boolean getIsgenerating() {
        return isgenerating;
    }

    public void setIsgenerating(Boolean isgenerating) {
        this.isgenerating = isgenerating;
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
    @Column(name = "lastgenerated")
    public Date getLastgenerated() {
        return lastgenerated;
    }

    public void setLastgenerated(Date lastgenerated) {
        this.lastgenerated = lastgenerated;
    }

    @Basic
    @Column(name = "messagelog")
    public String getMessagelog() {
        return messagelog;
    }

    public void setMessagelog(String messagelog) {
        this.messagelog = messagelog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource that = (Resource) o;
        return id == that.id &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(isgenerating, that.isgenerating) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(lastgenerated, that.lastgenerated) &&
                Objects.equals(messagelog, that.messagelog);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uid, name, description, isgenerating, datecreated, lastupdated, lastgenerated, messagelog);
    }
}