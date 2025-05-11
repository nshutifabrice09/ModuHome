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
@Table(name = "message_threads")
@NoArgsConstructor
@AllArgsConstructor
public class MessageThread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private boolean isRead;
    private LocalDateTime sentAt;

//    @ManyToOne
//    private User sender;
//
//    @ManyToOne
//    private User receiver;
}
