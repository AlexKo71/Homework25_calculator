package com.example.homework25_calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class CalculatorServiceParametersTest {
    CalculatorService calculatorService = new CalculatorService();

    static Stream <Arguments> parameters() {
        return Stream.of(arguments(7, 3), arguments(34, 45), arguments(37, -23),
                arguments(45, 63), arguments(201, 15), arguments(-23, -45));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void plus(int num1, int num2) {
        int expected = num1 + num2;
        int actual = calculatorService.plus(num1, num2);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void minus(int num1, int num2) {
        int expected = num1 - num2;
        int actual = calculatorService.minus(num1, num2);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void multiply(int num1, int num2) {
        int expected = num1 * num2;
        int actual = calculatorService.multiply(num1, num2);
        assertEquals(actual, expected);
    }

}