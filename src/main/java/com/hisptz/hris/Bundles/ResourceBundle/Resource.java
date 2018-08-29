package com.hisptz.hris.Bundles.ResourceBundle;

/**
 * Created by Guest on 8/14/18.
 */
import com.hisptz.hris.core.Model.main.Model;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "resource")
public class Resource extends Model {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String name;
    private String description;
    private Boolean isgenerating;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastgenerated;

    private String messagelog;


    public Resource() {
        super();
    }

    public Resource(String uid, String name, String description, Boolean isgenerating, String messagelog) {
        super();
        this.name = name;
        this.description = description;
        this.isgenerating = isgenerating;
        this.messagelog = messagelog;
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


}