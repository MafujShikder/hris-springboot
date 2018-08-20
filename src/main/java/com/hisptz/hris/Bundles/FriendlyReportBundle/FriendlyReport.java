package com.hisptz.hris.Bundles.FriendlyReportBundle;

/**
 * Created by Guest on 8/16/18.
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
@Table(name = "friendlyreport")
public class FriendlyReport extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer seriesId;
    private String uid;
    private String name;
    private String description;
    private Integer sort;
    private Boolean ignoreskipinreport;
    private Boolean usetargets;
    private Boolean showdeficitsurplus;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date datecreated;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastupdated;

    private String type;
    private String sql_statement;
    private String javascript;
    private String stylesheet;

    public FriendlyReport() {
    }

    public FriendlyReport(Long id) {
        this.id = id;
    }

    public FriendlyReport(Integer seriesId, String uid, String name, String description, Integer sort, Boolean ignoreskipinreport, Boolean usetargets, Boolean showdeficitsurplus, String type, String sql_statement, String javascript, String stylesheet) {
        this.seriesId = seriesId;
        this.uid = uid;
        this.name = name;
        this.description = description;
        this.sort = sort;
        this.ignoreskipinreport = ignoreskipinreport;
        this.usetargets = usetargets;
        this.showdeficitsurplus = showdeficitsurplus;
        this.type = type;
        this.sql_statement = sql_statement;
        this.javascript = javascript;
        this.stylesheet = stylesheet;
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
    @Column(name = "series_id")
    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
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
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "ignoreskipinreport")
    public Boolean getIgnoreskipinreport() {
        return ignoreskipinreport;
    }

    public void setIgnoreskipinreport(Boolean ignoreskipinreport) {
        this.ignoreskipinreport = ignoreskipinreport;
    }

    @Basic
    @Column(name = "usetargets")
    public Boolean getUsetargets() {
        return usetargets;
    }

    public void setUsetargets(Boolean usetargets) {
        this.usetargets = usetargets;
    }

    @Basic
    @Column(name = "showdeficitsurplus")
    public Boolean getShowdeficitsurplus() {
        return showdeficitsurplus;
    }

    public void setShowdeficitsurplus(Boolean showdeficitsurplus) {
        this.showdeficitsurplus = showdeficitsurplus;
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
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "sql_statement")
    public String getsql_statement() {
        return sql_statement;
    }

    public void setsql_statement(String sql_statement) {
        this.sql_statement = sql_statement;
    }

    @Basic
    @Column(name = "javascript")
    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
        this.javascript = javascript;
    }

    @Basic
    @Column(name = "stylesheet")
    public String getStylesheet() {
        return stylesheet;
    }

    public void setStylesheet(String stylesheet) {
        this.stylesheet = stylesheet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendlyReport that = (FriendlyReport) o;
        return id == that.id &&
                sort == that.sort &&
                Objects.equals(seriesId, that.seriesId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(ignoreskipinreport, that.ignoreskipinreport) &&
                Objects.equals(usetargets, that.usetargets) &&
                Objects.equals(showdeficitsurplus, that.showdeficitsurplus) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(type, that.type) &&
                Objects.equals(sql_statement, that.sql_statement) &&
                Objects.equals(javascript, that.javascript) &&
                Objects.equals(stylesheet, that.stylesheet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, seriesId, uid, name, description, sort, ignoreskipinreport, usetargets, showdeficitsurplus, datecreated, lastupdated, type, sql_statement, javascript, stylesheet);
    }
}