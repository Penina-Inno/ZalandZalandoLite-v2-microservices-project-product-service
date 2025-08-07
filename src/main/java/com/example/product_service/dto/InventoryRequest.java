package com.example.product_service.dto;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class InventoryRequest {
    private Long productId;
    private Integer quantity;

}
