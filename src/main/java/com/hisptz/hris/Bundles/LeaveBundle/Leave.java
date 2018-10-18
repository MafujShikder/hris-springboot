package com.hisptz.hris.Bundles.LeaveBundle;

import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveType;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "leave")
@Data
public class Leave extends Model {
    //To have a relationship with the record table
    @Basic
    @Column(name = "record_id")
    private  int recordId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "leave_type_id", nullable = false)
    private LeaveType leaveType;

    @Basic
    @Column(name = "username")
    @Size(max = 255)
    private String userName;

    @Basic
    @Column(name = "startdate")
    private Date startDate;

    @Basic
    @Column(name = "enddate")
    private Date enddate;

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

    public Leave(int recordId, LeaveType leaveType, String userName, Date startDate, Date enddate, int duration, int amount, String leaveBenefitApplicable,  String leaveBenefitStatus, String phone, String address, String email, String leaveDestination,  String reason) {
        this.recordId = recordId;
        this.leaveType = leaveType;
        this.userName = userName;
        this.startDate = startDate;
        this.enddate = enddate;
        this.duration = duration;
        this.amount = amount;
        this.leaveBenefitApplicable = leaveBenefitApplicable;
        this.leaveBenefitStatus = leaveBenefitStatus;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.leaveDestination = leaveDestination;
        this.reason = reason;
    }
}
