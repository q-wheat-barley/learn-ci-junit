package com.example.democi;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}
