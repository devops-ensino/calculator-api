package com.example.calculator.controller;

import com.example.calculator.model.OperationResponse;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public OperationResponse add(
            @RequestParam int a,
            @RequestParam int b) {

        return new OperationResponse(
                "addition",
                a,
                b,
                calculatorService.add(a, b)
        );
    }

    @GetMapping("/subtract")
    public OperationResponse subtract(
            @RequestParam int a,
            @RequestParam int b) {

        return new OperationResponse(
                "subtraction",
                a,
                b,
                calculatorService.subtract(a, b)
        );
    }

    @GetMapping("/multiply")
    public OperationResponse multiply(
            @RequestParam int a,
            @RequestParam int b) {

        return new OperationResponse(
                "multiplication",
                a,
                b,
                calculatorService.multiply(a, b)
        );
    }

    @GetMapping("/divide")
    public OperationResponse divide(
            @RequestParam int a,
            @RequestParam int b) {

        return new OperationResponse(
                "division",
                a,
                b,
                calculatorService.divide(a, b)
        );
    }

}
