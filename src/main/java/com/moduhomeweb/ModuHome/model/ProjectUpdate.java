package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Builder
@Entity
@Table(name = "project_updates")
@NoArgsConstructor
@AllArgsConstructor
public class ProjectUpdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String imageUrl;
    private LocalDateTime timestamp;

    @ManyToOne
    private Project project;
}
