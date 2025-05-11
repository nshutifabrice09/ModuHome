package com.moduhomeweb.ModuHome.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SiteStatistic {
    private Long id;
    private int totalUsers;
    private int totalBuilders;
    private int totalBlueprints;
    private BigDecimal totalRevenue;
    private LocalDate snapshotDate;
}
