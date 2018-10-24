package com.hisptz.hris.Bundles.MessageBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageQuery extends ModelQuery<Message> {
    @Autowired
    MessageRepository messageRepository;

    private ModelSpecification<Message> spec;

    public MessageQuery(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message getMessageById(Long id){
        return messageRepository.getOne(id);
    }

    public List<Message> Message(String where, String sort){
        return query(where, spec, messageRepository, sort);
    }

}
