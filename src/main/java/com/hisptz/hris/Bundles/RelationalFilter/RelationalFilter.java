package com.hisptz.hris.Bundles.RelationalFilter;

/**
 * Created by Guest on 8/14/18.
 */
import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.FieldOptionBundle.FieldOption;
import com.hisptz.hris.Bundles.FriendlyReportBundle.FriendlyReport;
import com.hisptz.hris.core.Model.main.Model;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "relationalfilter")
public class RelationalFilter extends Model {

    private Integer fieldId;
    private String name;
    private Boolean excludefieldoptions;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Field field;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            })
    @JoinTable(name = "relational_filter_field_group_option",
            joinColumns = {@JoinColumn(name = "relational_filter_id")},
            inverseJoinColumns = {@JoinColumn(name = "field_option_id")})
    private Set<FieldOption> fieldOptions = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            })
    @JoinTable(name = "relational_filter_friendly_report",
            joinColumns = {@JoinColumn(name = "relational_filter_id")},
            inverseJoinColumns = {@JoinColumn(name = "friendly_report_id")})
    private Set<FriendlyReport> friendlyReports = new HashSet<>();

    public RelationalFilter() {
        super();
    }

    public RelationalFilter(Integer fieldId, String uid, String name, Boolean excludefieldoptions, Long field) {
        super();
        this.fieldId = fieldId;
        this.name = name;
        this.excludefieldoptions = excludefieldoptions;
        this.field = new Field(field);
    }

    public Field getField() {
        return field;
    }

    public void setField(Long field) {
        this.field = new Field(field);
    }

    public Boolean getExcludefieldoptions() {
        return excludefieldoptions;
    }

    public Set<FriendlyReport> getFriendlyReports() {
        return friendlyReports;
    }

    public void setFriendlyReports(Set<FriendlyReport> friendlyReports) {
        this.friendlyReports = friendlyReports;
    }

    public Set<FieldOption> getFieldOptions() {
        return fieldOptions;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setFieldOptions(Set<FieldOption> fieldOptions) {
        this.fieldOptions = fieldOptions;
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
    @Column(name = "excludefieldoptions")
    public Boolean isExcludefieldoptions() {
        return excludefieldoptions;
    }

    public void setExcludefieldoptions(Boolean excludefieldoptions) {
        this.excludefieldoptions = excludefieldoptions;
    }


}