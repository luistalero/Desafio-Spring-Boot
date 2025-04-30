package com.schooltibu.schooltibu.domain.entities;

import java.time.LocalDateTime;

import com.schooltibu.schooltibu.domain.Fkclass.SkillRoutePathId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "skill_route_path")
@Entity
public class SkillRoutePath {
    @EmbeddedId
    private SkillRoutePathId id;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Skills skills;

    @ManyToOne
    @JoinColumn(name = "road_path_id", referencedColumnName = "id", insertable = false, updatable = false)
    private RoadPaths routePaths;

}
