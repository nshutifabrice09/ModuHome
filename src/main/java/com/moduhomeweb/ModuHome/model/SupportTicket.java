package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class SupportTicket {
    private Long id;
    private String subject;
    private String message;
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    @ManyToOne
    private User createdBy;
}
