package com.schooltibu.schooltibu.domain.entities;

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
public class TestQuestions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "questions_id", insertable = false, updatable = false)
    private Questions questions;

    @ManyToOne
    @JoinColumn(name = "test_config_id" , insertable = false, updatable = false)
    private TestConfig testConfig;
}
