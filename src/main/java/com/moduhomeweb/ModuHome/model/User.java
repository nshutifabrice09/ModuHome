package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private boolean isActive;

    @ManyToOne
    private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;
}
