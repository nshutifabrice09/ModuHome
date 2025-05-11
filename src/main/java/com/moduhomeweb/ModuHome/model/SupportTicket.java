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
@Table(name = "support_tickets")
@NoArgsConstructor
@AllArgsConstructor
public class SupportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private String message;
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    @ManyToOne
    private User createdBy;
}
