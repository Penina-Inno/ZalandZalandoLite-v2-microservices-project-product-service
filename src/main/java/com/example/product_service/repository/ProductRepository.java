package com.example.product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
Import java.util.List;

public Interface  ProductRepository extends JpaRepository<Product, Long>{

    // custom finder method to search products by category.
    List<Product> findByCategory category)

}
