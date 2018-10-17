package com.hisptz.hris.Bundles.LeaveTypeBundle;

import com.hisptz.hris.core.Model.main.Model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.Data;


@Entity
@Table(name = "leave_type")
@Data
public class LeaveType extends Model {
    // to be checked, needs relationship with field
    @Basic
    @Column(name = "field_id")
    private int fieldId;

    @Basic
    @Column(name = "name")
    @Size(max = 255)
    private String name;

    @Basic
    @Column(name = "maximum_days")
    private int maximumDays;

    @Basic
    @Column(name = "limit_applicable")
    @Size(max = 53)
    private String limitApplicable;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "payment_applicable")
    @Size(max = 53)
    private String paymentApplicable;

    public LeaveType(int fieldId, String name, int maximumDays, String limitApplicable, String description,
            String paymentApplicable) {
        this.fieldId = fieldId;
        this.name = name;
        this.maximumDays = maximumDays;
        this.limitApplicable = limitApplicable;
        this.description = description;
        this.paymentApplicable = paymentApplicable;
    }

    // @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
    // "leaveType")
    // private Leave leaveId;
}
