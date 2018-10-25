package com.hisptz.hris.Bundles.MessageThreadBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageThreadQuery extends ModelQuery<MessageThread> {
    @Autowired
    MessageThreadRepository messageThreadRepository;

    private ModelSpecification<MessageThread> spec;

    public MessageThreadQuery(MessageThreadRepository messageThreadRepository) {
        this.messageThreadRepository = messageThreadRepository;
    }

    public MessageThread getMessageThreadById(Long id){
        return messageThreadRepository.getOne(id);
    }

    public List<MessageThread> MessageThread(String where, String sort){
        return query(where, spec, messageThreadRepository, sort);
    }
}
