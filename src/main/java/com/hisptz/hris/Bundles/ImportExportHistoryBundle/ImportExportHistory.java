package com.hisptz.hris.Bundles.ImportExportHistoryBundle;

import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "importexport_history")
@Data
public class ImportExportHistory extends Model {
    @Basic
    @Column(name = "session_type")
    @Size(max = 64)
    private String sessionType;

    @Basic
    @Column(name = "object")
    @Size(max = 64)
    private String object;

    @Basic
    @Column(name = "status")
    @Size(max = 64)
    private String status;

    @Basic
    @Column(name = "count")
    private int count;

    @Basic
    @Column(name = "username")
    @Size(max = 64)
    private String userName;

    @Basic
    @Column(name = "starttime")
    private Date startTime;

    @Basic
    @Column(name = "finishtime")
    private Date finishTime;
}
