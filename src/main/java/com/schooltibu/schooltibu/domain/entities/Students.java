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
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "students")
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "age")
    private int age;

    @Column(name = "celphone", length = 30, nullable = true)
    private String celphone;

    @Column(name = "email", length = 50, nullable = true)
    private String email;

    @Column(name = "firstname", length = 50, nullable = true)
    private String firstname;

    @Column(name = "lastname", length = 50, nullable = true)
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "city_id")
    @JsonBackReference
    Cities cities;

    @ManyToOne
    @JoinColumn(name = "school_id")
    @JsonBackReference
    Schools schools;
}
