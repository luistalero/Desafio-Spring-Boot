package com.schooltibu.schooltibu.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    
}
