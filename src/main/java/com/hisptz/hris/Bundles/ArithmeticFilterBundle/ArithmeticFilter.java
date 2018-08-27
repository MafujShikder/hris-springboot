package com.hisptz.hris.Bundles.ArithmeticFilterBundle;

/**
 * Created by Guest on 8/14/18.
 */
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReport;
import com.hisptz.hris.core.Model.Model;
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
@Table(name = "arithmeticfilter")
public class ArithmeticFilter extends Model{
    private String uid;
    private String name;
    private String description;
    private String operator;
    private String leftexpression;
    private String rightexpression;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            })
    @JoinTable(name = "arithmetic_filter_friendly_report",
            joinColumns = {@JoinColumn(name = "arithmetic_filter_id")},
            inverseJoinColumns = {@JoinColumn(name = "friendly_report_id")})
    private Set<FriendlyReport> friendlyReports = new HashSet<>();

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


    public Set<FriendlyReport> getFriendlyReports() {
        return friendlyReports;
    }

    public void setFriendlyReports(Set<FriendlyReport> friendlyReports) {
        this.friendlyReports = friendlyReports;
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

}
