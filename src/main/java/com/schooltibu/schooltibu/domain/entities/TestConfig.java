package com.schooltibu.schooltibu.domain.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "test_config")
@Entity
public class TestConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "score")
    private int score;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "description", length = 80, nullable = true)
    private String description;

    // @OneToMany(mappedBy = "test_config", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    // @JsonManagedReference
    // private Set<TestQuestions> testQuestions = new HashSet<>();
}
