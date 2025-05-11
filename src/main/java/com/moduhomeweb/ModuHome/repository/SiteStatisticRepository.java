package com.moduhomeweb.ModuHome.repository;

import com.moduhomeweb.ModuHome.model.SiteStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteStatisticRepository extends JpaRepository<SiteStatistic, Long> {
}
