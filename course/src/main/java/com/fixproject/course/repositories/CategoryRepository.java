package com.fixproject.course.repositories;

import com.fixproject.course.entities.Category;
import com.fixproject.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Não é necessario pois herda do JPA
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
