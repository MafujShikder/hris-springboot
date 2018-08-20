package com.hisptz.hris.Bundles.FieldOptionGroupSetBundle;

import com.hisptz.hris.core.Model.Model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by Guest on 8/13/18.
 */

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "fieldoptiongroupset")
public class FieldOptionGroupSet extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uid;
    private String name;
    private String description;

    public FieldOptionGroupSet() {
    }

    public FieldOptionGroupSet(String uid, String name, String description) {
        this.uid = uid;
        this.name = name;
        this.description = description;
    }

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
