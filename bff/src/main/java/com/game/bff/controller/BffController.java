package com.game.bff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class BffController {

    @GetMapping("/user-details")
    public Map<String, Object> getUserDetails() {
        // Mock data (in a real app, this might come from a database or external service)
        return Map.of(
                "id", 1,
                "name", "John Doe",
                "email", "john.doe@example.com",
                "roles", List.of("USER", "ADMIN")
        );
    }

    @GetMapping("/products")
    public List<Map<String, Object>> getProducts() {
        // Mock data (replace with real data from a database or external service)
        return List.of(
                Map.of("id", 101, "name", "Product A", "price", 99.99),
                Map.of("id", 102, "name", "Product B", "price", 49.99),
                Map.of("id", 103, "name", "Product C", "price", 19.99)
        );
    }
}
