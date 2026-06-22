package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public Map<String, Object> health() {

        Map<String, Object> response = new LinkedHashMap<>();

        response.put("status", "UP");
        response.put("application", "calculator-api");
        response.put("timestamp", LocalDateTime.now());

        return response;
    }

}
