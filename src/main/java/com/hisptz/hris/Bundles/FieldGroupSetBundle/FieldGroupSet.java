package com.hisptz.hris.Bundles.FieldGroupSetBundle;

/**
 * Created by Guest on 8/10/18.
 */
import com.hisptz.hris.core.Model.main.Model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "fieldgroupset")
public class FieldGroupSet extends Model{
    private String name;
    private String description;

    public FieldGroupSet() {
        super();
    }

    public FieldGroupSet(String uid, String name, String description) {
        super();
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
