package com.schooltibu.schooltibu.domain.Fkclass;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MediaSubChaptersId implements Serializable{
    @Column(name = "media_type_id")
    private int media_Type_id;

    @Column(name = "subchapters_id")
    private int subChaptersId;
}
