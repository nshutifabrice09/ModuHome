package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class MessageThread {
    private Long id;
    private String message;
    private boolean isRead;
    private LocalDateTime sentAt;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User receiver;
}
