package com.hisptz.hris.Bundles.FriendlyReportBundle;

/**
 * Created by Guest on 8/16/18.
 */
import com.hisptz.hris.Bundles.ArithmeticFilterBundle.ArithmeticFilter;
import com.hisptz.hris.Bundles.RelationalFilter.RelationalFilter;
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
@Table(name = "friendlyreport")
public class FriendlyReport extends Model{
    private Integer seriesId;
    private String name;
    private String description;
    private Integer sort;
    private Boolean ignoreskipinreport;
    private Boolean usetargets;
    private Boolean showdeficitsurplus;

    private String type;
    private String sql_statement;
    private String javascript;
    private String stylesheet;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            },
            mappedBy = "friendlyReports")
    private Set<RelationalFilter> relationalFilters = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE
            },
            mappedBy = "friendlyReports")
    private Set<ArithmeticFilter> arithmeticFilters = new HashSet<>();

    public FriendlyReport() {
        super();
    }

    public FriendlyReport(Long id) {
        super();
        this.id = id;
    }

    public FriendlyReport(Integer seriesId, String uid, String name, String description, Integer sort, Boolean ignoreskipinreport, Boolean usetargets, Boolean showdeficitsurplus, String type, String sql_statement, String javascript, String stylesheet) {
        super();
        this.name = name;
        this.seriesId = seriesId;
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

    public Set<ArithmeticFilter> getArithmeticFilters() {
        return arithmeticFilters;
    }

    public void setArithmeticFilters(Set<ArithmeticFilter> arithmeticFilters) {
        this.arithmeticFilters = arithmeticFilters;
    }

    public String getSql_statement() {
        return sql_statement;
    }

    public void setSql_statement(String sql_statement) {
        this.sql_statement = sql_statement;
    }

    public Set<RelationalFilter> getRelationalFilters() {
        return relationalFilters;
    }

    public void setRelationalFilters(Set<RelationalFilter> relationalFilters) {
        this.relationalFilters = relationalFilters;
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


}