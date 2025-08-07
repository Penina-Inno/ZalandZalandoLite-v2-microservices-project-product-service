package com.example.product_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@configuration
public class RestTemplateConfig {

    @Bean
    public class RestTemplate(){
        return new RestTemplate();

    }
}
