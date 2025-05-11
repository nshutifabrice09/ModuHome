package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Blueprint {
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

    @ManyToOne
    private User uploadedBy;

    @ManyToMany
    private List<Tag> tags;
}
