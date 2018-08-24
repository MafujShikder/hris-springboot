package com.hisptz.hris.Bundles.FieldOptionGroup;

/**
 * Created by Guest on 8/10/18.
 */
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import com.hisptz.hris.core.Model.Model;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "fieldoptiongroup")
public class FieldOptionGroup extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer fieldId;
    private String uid;
    private String name;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date datecreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastupdated;
    
    private String operator;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Field field;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            })
    @JoinTable(name = "fieldGroupfieldGroupOption",
            joinColumns = {@JoinColumn(name = "field_group_id")},
            inverseJoinColumns = {@JoinColumn(name = "field_group_option_id")})
    private Set<FieldOption> fieldOptions = new HashSet<>();

    public FieldOptionGroup() {
    }

    public FieldOptionGroup(Integer fieldId, String uid, String name, String description, String operator, Long field) {
        this.fieldId = fieldId;
        this.uid = uid;
        this.name = name;
        this.description = description;
        this.operator = operator;

        if (field != null)
            this.field = new Field(field);
    }

    public Set<FieldOption> getFieldOptions() {
        return fieldOptions;
    }

    public void setFieldOptions(Set<FieldOption> fieldOptions) {
        this.fieldOptions = fieldOptions;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Field getField() {
        return field;
    }

    public void setField(Long id) {
        this.field = new Field(id);
    }

    @Basic
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "field_id")
    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
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

    @Basic
    @Column(name = "datecreated")
    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    @Basic
    @Column(name = "lastupdated")
    public Date getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Basic
    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldOptionGroup that = (FieldOptionGroup) o;
        return id == that.id &&
                Objects.equals(fieldId, that.fieldId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(operator, that.operator);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldId, uid, name, description, datecreated, lastupdated, operator);
    }
}