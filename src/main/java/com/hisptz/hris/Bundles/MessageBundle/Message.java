package com.hisptz.hris.Bundles.MessageBundle;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hisptz.hris.Bundles.MessageMetadataBundle.MessageMetadata;
import com.hisptz.hris.Bundles.MessageThreadBundle.MessageThread;
import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message")
@Data
public class Message extends Model {
//    @Basic
//    @Column(name = "thread_id")
//    private int threadId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "thread_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private MessageThread messageThread;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @Basic
    @Column(name = "body")
    private String body;

    @Basic
    @Column(name = "created_at")
    private Date createdAt;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "message")
    private MessageMetadata messageMetadata;

}
