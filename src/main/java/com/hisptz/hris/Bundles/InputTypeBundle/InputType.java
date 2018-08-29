package com.hisptz.hris.Bundles.InputTypeBundle;

import com.hisptz.hris.core.Model.main.Model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by Guest on 8/14/18.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "inputtype")
public class InputType extends Model{
    private String name;
    private String description;
    private String htmltag;

    public InputType() {
        super();
    }
    public InputType(Long id) {
        super();
        this.id = id;
    }

    public InputType(String uid, String name, String description, String htmltag) {
        super();
        this.name = name;
        this.description = description;
        this.htmltag = htmltag;
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

    public String getHtmltag() {
        return htmltag;
    }

    public void setHtmltag(String htmltag) {
        this.htmltag = htmltag;
    }

}
