package com.educandoWeb.courseSpring.repositories;

import com.educandoWeb.courseSpring.entities.Category;
import com.educandoWeb.courseSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
