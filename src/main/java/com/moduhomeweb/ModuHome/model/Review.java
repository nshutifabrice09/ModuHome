package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class Review {
    private Long id;
    private int rating;
    private String comment;
    private LocalDateTime reviewDate;

    @ManyToOne
    private User reviewer;

    @ManyToOne
    private BuilderProfile builder;
}
