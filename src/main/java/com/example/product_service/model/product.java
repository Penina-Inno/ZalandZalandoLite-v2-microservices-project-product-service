package com.example.product_service.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * JPA maps the entity to a  products table in PostgreSQL.
 * @Builder allows flexible object creation - e.g Product.builder().name("Jacket").build()
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class product {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String description;
    private Double price;




}
