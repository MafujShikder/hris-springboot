package com.hisptz.hris.Bundles.HelpTopicBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelpTopicQuery extends ModelQuery<HelpTopic> {
    @Autowired
    HelpTopicRepository helpTopicRepository;

    private ModelSpecification<HelpTopic> spec;

    public HelpTopicQuery(HelpTopicRepository helpTopicRepository) {
        this.helpTopicRepository = helpTopicRepository;
    }

    public HelpTopic getHelpTopicById(Long id){
        return helpTopicRepository.getOne(id);
    }

    public List<HelpTopic> HelpTopic(String where, String sort){
        return query(where, spec, helpTopicRepository, sort);
    }
}
