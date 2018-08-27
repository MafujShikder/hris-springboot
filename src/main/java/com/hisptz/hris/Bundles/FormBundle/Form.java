package com.hisptz.hris.Bundles.FormBundle;

/**
 * Created by Guest on 8/14/18.
 */
import com.hisptz.hris.core.Model.Model;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "form")
public class Form extends Model {
    private String uid;
    private String name;
    private String hypertext;
    private String title;

    public Form() {
    }

    public Form(String uid, String name, String hypertext, String title) {
        this.uid = uid;
        this.name = name;
        this.hypertext = hypertext;
        this.title = title;
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
    @Column(name = "hypertext")
    public String getHypertext() {
        return hypertext;
    }

    public void setHypertext(String hypertext) {
        this.hypertext = hypertext;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}