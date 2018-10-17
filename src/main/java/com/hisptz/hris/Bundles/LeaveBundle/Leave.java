package com.hisptz.hris.Bundles.LeaveBundle;

import com.hisptz.hris.Bundles.LeaveTypeBundle.LeaveType;
import com.hisptz.hris.core.Model.main.Model;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "leavetype_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
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
    private Date endDate;

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

    public Leave(int fieldId, String userName, Date startDate, Date endDate, int duration, int amount,
            String leaveBenefitApplicable, String leaveBenefitStatus, String phone, String address, String email,
            String leaveDestination, String reason) {
        this.fieldId = fieldId;
        this.userName = userName;
        this.startDate = startDate;
        this.endDate = endDate;
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
