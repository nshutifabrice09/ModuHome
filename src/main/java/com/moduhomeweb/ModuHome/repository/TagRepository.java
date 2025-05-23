package com.moduhomeweb.ModuHome.repository;

import com.moduhomeweb.ModuHome.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository <Tag, Long> {
}
