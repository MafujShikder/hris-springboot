package com.hisptz.hris.Bundles.HelpChapterBundle;

import com.hisptz.hris.core.Model.common.ModelSpecification;
import com.hisptz.hris.core.Model.main.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelpChapterQuery extends ModelQuery<HelpChapter> {

    @Autowired
    HelpChapterRepository helpChapterRepository;

    private ModelSpecification<HelpChapter> spec;

    public HelpChapterQuery(HelpChapterRepository helpChapterRepository) {
        this.helpChapterRepository = helpChapterRepository;
    }

    public HelpChapter getHelpChapterById(Long id){
        return helpChapterRepository.getOne(id);
    }

    public List<HelpChapter> HelpChapter(String where, String sort){
        return query(where, spec, helpChapterRepository, sort);
    }
}
