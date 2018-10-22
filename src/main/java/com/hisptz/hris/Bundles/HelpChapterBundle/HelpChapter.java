package com.hisptz.hris.Bundles.HelpChapterBundle;

import com.hisptz.hris.Bundles.HelpTopicBundle.HelpTopic;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "help_chapter")
@Data
public class HelpChapter extends Model {
    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "content")
    private String content;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "helpChapters")
    private Set<HelpTopic> helpTopics = new HashSet<HelpTopic>();
}
