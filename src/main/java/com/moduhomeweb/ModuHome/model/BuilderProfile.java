package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public class BuilderProfile {

    private Long id;
    private String companyName;
    private String licenseNumber;
    private String description;
    private boolean isVerified;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "builder")
    private List<Review> reviews;

    @OneToMany
    private List<ServiceArea> serviceAreas;
}

