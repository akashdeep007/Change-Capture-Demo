package com.example.changecapturedemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Apply CORS configuration to all API endpoints
                        .allowedOrigins("http://localhost:5173") // Allow requests from this origin
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow these HTTP methods
                        .allowCredentials(true); // Allow sending cookies
            }
        };
    }
}