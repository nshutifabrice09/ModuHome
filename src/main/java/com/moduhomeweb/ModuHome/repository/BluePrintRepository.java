package com.moduhomeweb.ModuHome.repository;

import com.moduhomeweb.ModuHome.model.Blueprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BluePrintRepository extends JpaRepository <Blueprint, Long> {
}
