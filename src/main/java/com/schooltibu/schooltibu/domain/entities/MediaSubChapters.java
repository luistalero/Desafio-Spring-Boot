package com.schooltibu.schooltibu.domain.entities;

import com.schooltibu.schooltibu.domain.Fkclass.MediaSubChaptersId;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "media_sub_chapters")
@Entity
public class MediaSubChapters {
    @EmbeddedId
    private MediaSubChaptersId id;

    @ManyToOne
    @JoinColumn(name = "media_type_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MediaTypes mediaTypes;

    @ManyToOne
    @JoinColumn(name = "subchapters_id", referencedColumnName = "id", insertable = false, updatable = false)
    private SubChapters subChapters;
}
