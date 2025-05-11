package com.moduhomeweb.ModuHome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Builder
@Entity
@Table(name = "site_statistics")
@NoArgsConstructor
@AllArgsConstructor
public class SiteStatistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int totalUsers;
    private int totalBuilders;
    private int totalBlueprints;
    private BigDecimal totalRevenue;
    private LocalDate snapshotDate;
}
