package com.example.democi;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void 足し算() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(1, 2);
        assert result == 3;
    }

    @Test
    void 引き算() {
        Calculator calculator = new Calculator();
        int result = calculator.minus(2, 1);
        assert result == 1;
    }
}
