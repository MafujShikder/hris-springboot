package com.hisptz.hris.Bundles.LeaveRelativeBundle;

import com.hisptz.hris.Bundles.LeaveBundle.Leave;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "leave_relative")
@Data
public class LeaveRelative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leave_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Leave leave;

    @Basic
    @Column(name = "name")
    @Size(max = 255)
    private String name;

    @Basic
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Basic
    @Column(name = "age")
    private int age;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Size(max = 13)
    private String uid;

    public LeaveRelative(Long id, String name, Date dateOfBirth, int age, String uid) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.uid = uid;
    }
}
