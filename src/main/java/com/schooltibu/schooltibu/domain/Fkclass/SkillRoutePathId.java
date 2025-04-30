package com.schooltibu.schooltibu.domain.Fkclass;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class SkillRoutePathId implements Serializable{
    @Column(name = "skill_id")
    private int skillId;

    @Column(name = "road_path_id")
    private int roadPathId;
}
