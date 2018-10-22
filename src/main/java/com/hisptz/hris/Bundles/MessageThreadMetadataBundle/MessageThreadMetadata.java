package com.hisptz.hris.Bundles.MessageThreadMetadataBundle;

import com.hisptz.hris.Bundles.MessageThreadBundle.MessageThread;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message_thread_metadata")
@Data
public class MessageThreadMetadata extends Model {
//    @Basic
//    @Column(name = "thread_id")
//    private Long threadId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "thread_id", nullable = false)
    private MessageThread messageThread;

    @Basic
    @Column(name = "participant_id")
    private Long participantId;

    @Basic
    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Basic
    @Column(name = "last_participant_message_date")
    private Date lastParticipantMessageDate;

    @Basic
    @Column(name = "last_message_date")
    private Date lastMessageDate;
}
