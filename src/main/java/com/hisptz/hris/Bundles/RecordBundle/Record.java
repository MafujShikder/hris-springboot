package com.hisptz.hris.Bundles.RecordBundle;

import com.hisptz.hris.Bundles.RecordValue.RecordValue;
import com.hisptz.hris.core.Model.Model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Guest on 8/29/18.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "record")
public class Record extends Model{
    private Long organisationunitId;
    private Long formId;
    private String instance;
    private Boolean complete;
    private Boolean correct;
    private Boolean hasHistory;
    private Boolean hasTraining;
    private String username;

    public Record() {
    }

    public Record(Long organisationunitId, Long formId, String instance, Boolean complete, Boolean correct, Boolean hasHistory, Boolean hasTraining, String username) {
        super();
        this.organisationunitId = organisationunitId;
        this.formId = formId;
        this.instance = instance;
        this.complete = complete;
        this.correct = correct;
        this.hasHistory = hasHistory;
        this.hasTraining = hasTraining;
        this.username = username;
    }

    public Long getOrganisationunitId() {
        return organisationunitId;
    }

    public void setOrganisationunitId(Long organisationunitId) {
        this.organisationunitId = organisationunitId;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public Boolean isComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Boolean isCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Boolean isHasHistory() {
        return hasHistory;
    }

    public void setHasHistory(Boolean hasHistory) {
        this.hasHistory = hasHistory;
    }

    public Boolean isHasTraining() {
        return hasTraining;
    }

    public void setHasTraining(Boolean hasTraining) {
        this.hasTraining = hasTraining;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
