package com.example.product_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @GetMapping
    public List<ProductDto> getAll() {

        return service.getAllProducts();
    }
    /**
     * GET /products — returns list of all products with live stock data.
     *
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody ProductRequest request) {
        return productService.createProduct(request);
    }
    /**
     * Request object for adding product with initial quantity.
     *
     * @param product  product entity
     * @param quantity quantity to initialize
     */
    public record ProductWithQuantity(Product product, int quantity) {}
}
