package com.schooltibu.schooltibu.domain.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "road_paths")
@Entity
public class RoadPaths {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "isactive")
    private boolean isActive;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "image_path", length = 80, nullable = false)
    private String imagePath;

    @Column(name = "path_name", length = 80, nullable = true)
    private String pathName;

    @Column(name = "description", length = 80, nullable = true)
    private String description;

}
