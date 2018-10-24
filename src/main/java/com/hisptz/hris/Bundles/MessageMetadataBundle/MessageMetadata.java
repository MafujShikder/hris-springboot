package com.hisptz.hris.Bundles.MessageMetadataBundle;

import com.hisptz.hris.Bundles.MessageBundle.Message;
import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name = "message_metadata")
@Data
public class MessageMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "message_id")
//    private int messageId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "message_id", nullable = false)
    private Message message;
    
    @Basic
    @Column(name = "is_read")
    private boolean isRead;

    @Basic
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uid")
    private String uid;
}
