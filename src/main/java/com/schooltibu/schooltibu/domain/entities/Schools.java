package com.schooltibu.schooltibu.domain.entities;

import java.time.LocalDateTime;
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
@Table(name = "schools")
@Entity
public class Schools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "description_school", length = 50, nullable = true)
    private String descriptionSchool;

    @Column(name = "headmaster_school", length = 50, nullable = true)
    private String headmasterSchool;

    @Column(name = "celphone_school", length = 50, nullable = true)
    private String celphoneSchool;

    @Column(name = "email_school", length = 50, nullable = true)
    private String emailSchool;

    @OneToMany(mappedBy = "schools",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Students> students = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "city_id")
    @JsonBackReference
    Cities cities;
}
