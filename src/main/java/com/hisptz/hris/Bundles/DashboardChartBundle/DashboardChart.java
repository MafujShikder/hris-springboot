package com.hisptz.hris.Bundles.DashboardChartBundle;

/**
 * Created by Guest on 8/16/18.
 */
import com.hisptz.hris.core.Model.main.Model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;



@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "dashboardchart")
public class DashboardChart extends Model {
    private Integer fieldoneId;
    private Integer fieldtwoId;
    private Integer userId;

    private String name;
    private String description;
    private String graphtype;
    private Boolean lowerlevels;
    private Boolean systemwide;

    public DashboardChart() {
        super();
    }


    public DashboardChart(Long id) {
        super();
        this.id = id;
    }

    public DashboardChart(Integer fieldoneId, Integer fieldtwoId, Integer userId, String name, String description, String graphtype, Boolean lowerlevels, Boolean systemwide) {
        super();
        this.fieldoneId = fieldoneId;
        this.fieldtwoId = fieldtwoId;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.graphtype = graphtype;
        this.lowerlevels = lowerlevels;
        this.systemwide = systemwide;
    }

    public Boolean getLowerlevels() {
        return lowerlevels;
    }

    public Boolean getSystemwide() {
        return systemwide;
    }


    @Basic
    @Column(name = "fieldone_id")
    public Integer getFieldoneId() {
        return fieldoneId;
    }

    public void setFieldoneId(Integer fieldoneId) {
        this.fieldoneId = fieldoneId;
    }

    @Basic
    @Column(name = "fieldtwo_id")
    public Integer getFieldtwoId() {
        return fieldtwoId;
    }

    public void setFieldtwoId(Integer fieldtwoId) {
        this.fieldtwoId = fieldtwoId;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "graphtype")
    public String getGraphtype() {
        return graphtype;
    }

    public void setGraphtype(String graphtype) {
        this.graphtype = graphtype;
    }

    @Basic
    @Column(name = "lowerlevels")
    public Boolean isLowerlevels() {
        return lowerlevels;
    }

    public void setLowerlevels(Boolean lowerlevels) {
        this.lowerlevels = lowerlevels;
    }

    @Basic
    @Column(name = "systemwide")
    public Boolean isSystemwide() {
        return systemwide;
    }

    public void setSystemwide(Boolean systemwide) {
        this.systemwide = systemwide;
    }

}