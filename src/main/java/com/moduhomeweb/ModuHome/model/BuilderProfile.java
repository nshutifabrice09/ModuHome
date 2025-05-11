package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@Entity
@Table(name = "blue_prints")
@NoArgsConstructor
@AllArgsConstructor

public class BuilderProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String licenseNumber;
    private String description;
    private boolean isVerified;

//    @OneToOne(mappedBy = "user_id")
//    private User user;
//
//    @OneToMany(mappedBy = "builder")
//    private List<Review> reviews;
//
//    @OneToMany
//    private List<ServiceArea> serviceAreas;
}

