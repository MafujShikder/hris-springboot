package com.hisptz.hris.Bundles.HelpTopicBundle;

import com.hisptz.hris.Bundles.HelpChapterBundle.HelpChapter;
import com.hisptz.hris.core.Model.main.Model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "helptopic")
@Data
public class HelpTopic extends Model {
    @Basic
    @Column(name = "name")
    @Size(max = 64)
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "help_topic_chapters",
        joinColumns = @JoinColumn(name = "topic_id"),
    inverseJoinColumns = @JoinColumn(name = "chapter_id"))
    private Set<HelpChapter> helpChapters = new HashSet<HelpChapter>();
}
