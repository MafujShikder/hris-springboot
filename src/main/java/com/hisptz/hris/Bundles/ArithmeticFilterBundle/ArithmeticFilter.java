package com.hisptz.hris.Bundles.ArithmeticFilterBundle;

/**
 * Created by Guest on 8/14/18.
 */
import com.hisptz.hris.core.Model.Model;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "arithmeticfilter")
public class ArithmeticFilter extends Model{
    private String uid;
    private String name;
    private String description;
    private String operator;
    private String leftexpression;
    private String rightexpression;
    
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date datecreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastupdated;


    public ArithmeticFilter() {
    }

    public ArithmeticFilter(String uid, String name, String description, String operator, String leftexpression, String rightexpression) {
        this.uid = uid;
        this.name = name;
        this.description = description;
        this.operator = operator;
        this.leftexpression = leftexpression;
        this.rightexpression = rightexpression;
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
    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "leftexpression")
    public String getLeftexpression() {
        return leftexpression;
    }

    public void setLeftexpression(String leftexpression) {
        this.leftexpression = leftexpression;
    }

    @Basic
    @Column(name = "rightexpression")
    public String getRightexpression() {
        return rightexpression;
    }

    public void setRightexpression(String rightexpression) {
        this.rightexpression = rightexpression;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArithmeticFilter that = (ArithmeticFilter) o;
        return id == that.id &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(leftexpression, that.leftexpression) &&
                Objects.equals(rightexpression, that.rightexpression) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uid, name, description, operator, leftexpression, rightexpression, datecreated, lastupdated);
    }
}
