package com.hisptz.hris.Bundles.ValidationBundle;

import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "validation")
@Data
public class Validation extends Model {
    @Basic
    @Column(name = "name")
    @Size(max = 64)
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "operator")
    @Size(max = 40)
    private String operator;

    @Basic
    @Column(name = "leftexpression")
    @Size(max = 255)
    private String leftExpression;

    @Basic
    @Column(name = "rightexpression")
    @Size(max = 255)
    private String rightExpression;

}
