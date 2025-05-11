package com.moduhomeweb.ModuHome.repository;

import com.moduhomeweb.ModuHome.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {
}
