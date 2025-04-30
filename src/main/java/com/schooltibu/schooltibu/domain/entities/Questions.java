package com.schooltibu.schooltibu.domain.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "questions")
@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "score")
    private int score;

    @Column(name = "description", length = 80, nullable = true)
    private String description;

    @ManyToOne
    @JoinColumn(name = "typeoptions_id")
    @JsonBackReference
    TypeOptions typeOptions;

    // @OneToMany(mappedBy = "questions",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    // @JsonManagedReference
    // private Set<Answers> answers = new HashSet<>();

    // @OneToMany(mappedBy = "questions",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    // @JsonManagedReference
    // private Set<TestQuestions> testQuestions = new HashSet<>();
}
