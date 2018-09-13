package com.hisptz.hris.Bundles.FieldOptionBundle;

/**
 * Created by Guest on 8/10/18.
 */
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldOptionGroup.FieldOptionGroup;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilter;
import com.hisptz.hris.core.Model.main.Model;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "fieldoption")
public class FieldOption extends Model {
    private String value;
    private Boolean skipinreport;
    private String description;
    private Integer sort;
    private Boolean hastraining;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Field field;

    @ManyToMany(fetch = FetchType.LAZY,
//                cascade = {
//                        CascadeType.MERGE
  //              },
    mappedBy = "fieldOptions")
    private Set<FieldOptionGroup> fieldOptionGroups = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            },
            mappedBy = "fieldOptions")
    private Set<RelationalFilter> relationalFilters = new HashSet<>();

    public FieldOption() {
    }

    public FieldOption(Long id) {
        this.id = id;
    }
    public FieldOption(String uid, String value, Boolean skipinreport, String description, Integer sort, Boolean hastraining) {
        super();
        this.value = value;
        this.skipinreport = skipinreport;
        this.description = description;
        this.sort = sort;
        this.hastraining = hastraining;
    }

    public Set<RelationalFilter> getRelationalFilters() {
        return relationalFilters;
    }

    public void setRelationalFilters(Set<RelationalFilter> relationalFilters) {
        this.relationalFilters = relationalFilters;
    }

    public Set<FieldOptionGroup> getFieldOptionGroups() {
        return fieldOptionGroups;
    }

    public void setFieldOptionGroups(Set<FieldOptionGroup> fieldOptionGroups) {
        this.fieldOptionGroups = fieldOptionGroups;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
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
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "skipinreport")
    public Boolean getSkipinreport() {
        return skipinreport;
    }

    public void setSkipinreport(Boolean skipinreport) {
        this.skipinreport = skipinreport;
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
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "hastraining")
    public Boolean getHastraining() {
        return hastraining;
    }

    public void setHastraining(Boolean hastraining) {
        this.hastraining = hastraining;
    }

}