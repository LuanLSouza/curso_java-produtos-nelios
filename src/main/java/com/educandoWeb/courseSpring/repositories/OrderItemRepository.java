package com.educandoWeb.courseSpring.repositories;

import com.educandoWeb.courseSpring.entities.OrderItem;
import com.educandoWeb.courseSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
