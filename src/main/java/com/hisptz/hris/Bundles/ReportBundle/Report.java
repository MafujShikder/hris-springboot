package com.hisptz.hris.Bundles.ReportBundle;

import com.hisptz.hris.core.Model.main.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "report")
public class Report extends Model {
    @Basic
    @Column(name = "name")
    @Size(max = 64)
    private String name;

    @Basic
    @Column(name = "createdby")
    @Size(max = 64)
    private String createdBy;

    @Basic
    @Column(name = "uri")
    private String uri;

    @Basic
    @Column(name = "parameters")
    private String parameters;

}
