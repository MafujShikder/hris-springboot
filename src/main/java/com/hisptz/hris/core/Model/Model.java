package com.hisptz.hris.core.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by vincent on 8/16/18.
 */
@Entity
@Inheritance
public abstract class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
}
