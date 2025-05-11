package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "blue_prints")
@NoArgsConstructor
@AllArgsConstructor
public class Blueprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String blueprintFileUrl;
    private String previewImageUrl;
    private BigDecimal price;
    private float ecoScore;
    private String category;
    private boolean isApproved;
    private LocalDateTime createdAt;

//    @ManyToOne
//    private User uploadedBy;
//
//    @ManyToMany
//    private List<Tag> tags;
}
