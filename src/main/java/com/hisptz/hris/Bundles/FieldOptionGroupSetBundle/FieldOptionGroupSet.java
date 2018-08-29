package com.hisptz.hris.Bundles.FieldOptionGroupSetBundle;

import com.hisptz.hris.core.Model.main.Model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by Guest on 8/13/18.
 */

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "fieldoptiongroupset")
public class FieldOptionGroupSet extends Model{
    private String name;
    private String description;

    public FieldOptionGroupSet() {
        super();
    }

    public FieldOptionGroupSet(String uid, String name, String description) {
        super();
        this.name = name;
        this.description = description;
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
}
