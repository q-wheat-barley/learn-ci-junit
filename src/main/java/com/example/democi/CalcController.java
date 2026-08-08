package com.example.democi;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequiredArgsConstructor
public class CalcController {

    private final Calculator calculator;

    @GetMapping("/plus/{a}/{b}")
    public int plus(@PathVariable int a, @PathVariable int b) {
        return calculator.plus(a, b);
    }

    @GetMapping("/minus/{a}/{b}")
    public int minus(@PathVariable int a, @PathVariable int b) {
        return calculator.minus(a, b);
    }

    @GetMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return calculator.multiply(a, b);
    }
}
