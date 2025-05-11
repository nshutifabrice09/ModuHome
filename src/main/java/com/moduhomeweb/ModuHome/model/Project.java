package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;
import java.util.List;

public class Project {
    private Long id;
    private LocalDate startDate;
    private LocalDate expectedCompletionDate;
    private String progressNotes;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @OneToOne
    private Order order;

    @OneToMany(mappedBy = "project")
    private List<ProjectUpdate> updates;
}
