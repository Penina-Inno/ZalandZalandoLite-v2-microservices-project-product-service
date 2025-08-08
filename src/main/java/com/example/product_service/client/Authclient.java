package com.example.product_service.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Centralize token-fetching logic
 * Keep service layer clean- single responsibilty
 * Uses RestTemplate to avoid dependency and keep it simple.
 */

@Component
public class Authclient {

    private final RestTemplate restTemplate;

    @Value("${auth.base-url}")
    private String authBaseUrl;

    public AuthClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Authclient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Fetches a bearer token from the auth-service for a specific user.
     * The token is later used to call other services with internal authorization.
     *
     * @param userId internal customer/user identifier
     * @return Bearer token as String
     */
    public String getToken(String userId) {
        String url = UriComponentsBuilder.fromHttpUrl(authBaseUrl)
                .path("/internal/token")
                .queryParam("userId", userId)
                .toUriString();

        return restTemplate.getForObject(url, String.class);
    }

    @Configuration
    public static class RestTemplateConfig {

        @Bean
        public class RestTemplate(){
            return new RestTemplate();

    }
}
