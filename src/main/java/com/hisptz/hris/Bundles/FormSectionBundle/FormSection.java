package com.hisptz.hris.Bundles.FormSectionBundle;

/**
 * Created by Guest on 8/14/18.
 */
import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.*;

@Entity
@Table(name = "formsection")
public class FormSection extends Model{
    private Integer formId;
    private String name;
    private String description;

    public FormSection(Long id) {
        super();
        this.id = id;
    }

    public FormSection(Integer formId, String uid, String name, String description) {
        super();
        this.formId = formId;
        this.name = name;
        this.description = description;
    }

    public FormSection() {
        super();
    }

    @Basic
    @Column(name = "form_id")
    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
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