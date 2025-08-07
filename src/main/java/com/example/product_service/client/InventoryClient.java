package com.example.product_service.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class InventoryClient {

    private final RestTemplate restTemplate;

    @Value("${inventory.base-url}")
    private String inventoryBaseUrl;

    public InventoryClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void initializeStock(StockRequest stockRequest, String token) {
        String url = inventoryBaseUrl + "/internal/stock/init";

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<StockRequest> entity = new HttpEntity<>(stockRequest, headers);

        restTemplate.exchange(url, HttpMethod.POST, entity, Void.class);
    }
}
