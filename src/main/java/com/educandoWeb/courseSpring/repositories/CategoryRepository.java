package com.educandoWeb.courseSpring.repositories;

import com.educandoWeb.courseSpring.entities.Category;
import com.educandoWeb.courseSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
