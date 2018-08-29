package com.hisptz.hris.Bundles.RecordValue;

import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.Bundles.RecordBundle.Record;
import com.hisptz.hris.core.Model.main.Model;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by Guest on 8/29/18.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "record_value")
public class RecordValue extends Model {

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "record_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Record record;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "field_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Field field;

    private String value;

    public RecordValue() {
        super();
    }

    public RecordValue(String value) {
        super();
        this.value = value;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
