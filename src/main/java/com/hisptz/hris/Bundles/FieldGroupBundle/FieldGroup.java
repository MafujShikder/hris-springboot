package com.hisptz.hris.Bundles.FieldGroupBundle;

/**
 * Created by Guest on 8/10/18.
 */
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.core.Model.Model;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "fieldgroup")
public class FieldGroup extends Model{
    private String uid;
    private String name;
    private String description;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            },
            mappedBy = "fieldGroups")
    private Set<Field> fields = new HashSet<>();

    public Set<Field> getFields() {
        return fields;
    }

    public void setFields(Set<Field> fields) {
        this.fields = fields;
    }

    public FieldGroup() {
    }

    public FieldGroup(Long id) {
        this.id = id;
    }
    public FieldGroup(String uid, String name, String description) {
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