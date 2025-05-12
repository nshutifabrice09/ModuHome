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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public int getTotalBuilders() {
        return totalBuilders;
    }

    public void setTotalBuilders(int totalBuilders) {
        this.totalBuilders = totalBuilders;
    }

    public int getTotalBlueprints() {
        return totalBlueprints;
    }

    public void setTotalBlueprints(int totalBlueprints) {
        this.totalBlueprints = totalBlueprints;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public LocalDate getSnapshotDate() {
        return snapshotDate;
    }

    public void setSnapshotDate(LocalDate snapshotDate) {
        this.snapshotDate = snapshotDate;
    }
}
