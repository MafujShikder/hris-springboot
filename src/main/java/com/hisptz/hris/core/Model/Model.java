package com.hisptz.hris.core.Model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

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
}
