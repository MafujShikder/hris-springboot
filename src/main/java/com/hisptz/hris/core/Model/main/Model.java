package com.hisptz.hris.core.Model.main;

import com.hisptz.hris.core.Services.RandomStringGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Guest on 8/20/18.
 */
@MappedSuperclass
public class Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    protected String uid;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    protected Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    protected Date lastUpdated;



    public Model() {
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
        this.uid = randomStringGenerator.givenUsingApache_whenGeneratingRandomAlphabeticString_thenCorrect(12);
    }

    @Basic
    @Column(name = "id")
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
