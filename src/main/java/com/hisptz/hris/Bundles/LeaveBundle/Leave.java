package com.hisptz.hris.Bundles.LeaveBundle;

import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveType;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
@Table(name = "leave")
@Data
public class Leave extends Model {
    /**
     * add relationship with record, through record_id
     */
    @Basic
    @Column(name = "field_id")
    private int fieldId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "leave_type_id", nullable = false)
    private LeaveType leaveType;

    @Basic
    @Column(name = "username")
    @Size(max = 255)
    private String userName;

    @Basic
    @Column(name = "startdate")
    private Timestamp startDate;

    @Basic
    @Column(name = "enddate")
    private Timestamp endDate;

    @Basic
    @Column(name = "duration")
    private int duration;

    @Basic
    @Column(name = "amount")
    private int amount;

    @Basic
    @Column(name = "leave_benefit_applicable")
    @Size(max = 13)
    private String leaveBenefitApplicable;

    @Basic
    @Column(name = "leave_benefit_status")
    @Size(max = 13)
    private String leaveBenefitStatus;

    @Basic
    @Column(name = "phone")
    @Size(max = 255)
    private String phone;

    @Basic
    @Column(name = "address")
    @Size(max = 255)
    private String address;

    @Basic
    @Column(name = "email")
    @Size(max = 255)
    private String email;

    @Basic
    @Column(name = "leave_destination")
    @Size(max = 255)
    private String leaveDestination;

    @Basic
    @Column(name = "reason")
    @Size(max = 255)
    private String reason;

}
