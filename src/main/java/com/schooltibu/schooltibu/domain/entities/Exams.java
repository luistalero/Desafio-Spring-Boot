package com.schooltibu.schooltibu.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "test_questions")
@Entity
public class Exams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date_presentation")
    private LocalDateTime datePresentation;

    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private Students students;

    @ManyToOne
    @JoinColumn(name = "test_config_id", insertable = false, updatable = false) 
    private TestConfig testConfig;
}
