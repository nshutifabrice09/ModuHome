package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class ProjectUpdate {
    private Long id;
    private String description;
    private String imageUrl;
    private LocalDateTime timestamp;

    @ManyToOne
    private Project project;
}
