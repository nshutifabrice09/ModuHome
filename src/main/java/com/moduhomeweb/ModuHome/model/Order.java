package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private Long id;
    private BigDecimal totalPrice;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    private User client;

    @ManyToOne
    private Blueprint blueprint;

    @ManyToOne
    private BuilderProfile builder;
}
