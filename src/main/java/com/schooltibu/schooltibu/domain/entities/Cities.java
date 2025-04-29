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
@Table(name = "cities")
@Entity
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_city", length = 50, nullable = true)
    private String nameCity;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "state_abbreviation", length = 6)
    private String abbreviation;

    @ManyToOne
    @JoinColumn(name = "state_id")
    @JsonBackReference
    private States states;

    @OneToMany(mappedBy = "cities",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Schools> schools = new HashSet<>();

    @OneToMany(mappedBy = "cities",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Students> students = new HashSet<>();
}
