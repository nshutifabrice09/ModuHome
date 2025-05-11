package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@Builder
@Entity
@Table(name = "projects")
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
