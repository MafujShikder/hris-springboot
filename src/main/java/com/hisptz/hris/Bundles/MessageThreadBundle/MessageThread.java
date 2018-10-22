package com.hisptz.hris.Bundles.MessageThreadBundle;

import com.hisptz.hris.Bundles.MessageThreadMetadataBundle.MessageThreadMetadata;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message_thread")
@Data
public class MessageThread extends Model {
    @Basic
    @Column(name = "createdby_id")
    private int createdBy;

    @Basic
    @Column(name = "subject")
    private String subject;

    @Basic
    @Column(name = "createdate")
    private Date createDate;

    @Basic
    @Column(name = "isspam")
    private boolean isSpam;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "messageThread")
    private MessageThreadMetadata messageThreadMetadata;
}

