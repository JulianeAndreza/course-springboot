package com.fixproject.course.repositories;

import com.fixproject.course.entities.Product;
import com.fixproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Não é necessario pois herda do JPA
public interface ProductRepository extends JpaRepository<Product, Long> {

}
