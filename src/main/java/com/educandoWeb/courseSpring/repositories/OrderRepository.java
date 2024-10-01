package com.educandoWeb.courseSpring.repositories;

import com.educandoWeb.courseSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
