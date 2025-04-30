package com.schooltibu.schooltibu.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "subchapters")
@Entity
public class SubChapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = true)
    private int id;

    @Column(name = "description", length = 80, nullable = true)
    private String description; 

    @Column(name = "summary", length = 80, nullable = true)
    private String summary;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    @JsonBackReference
    Chapters chapters;
}
