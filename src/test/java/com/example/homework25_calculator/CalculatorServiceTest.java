package com.example.homework25_calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void plus() {
        int actual1 = calculatorService.plus(5, 7);
        int expected1 = 5 + 7;
        assertEquals(actual1, expected1);

        int actual2 = calculatorService.plus(-2, 3);
        int expected2 = -2 + 3;
        assertEquals(actual2, expected2);

    }

    @Test
    void minus() {
        int actual1 = calculatorService.minus(10, 12);
        int expected1 = 10 - 12;
        assertEquals(actual1,expected1);

        int actual2 = calculatorService.minus(35, 20);
        int expected2 = 35 - 20;
        assertEquals(actual2,expected2);
    }

    @Test
    void multiply() {
        int actual1 = calculatorService.multiply(22, 12);
        int expected1 = 22 * 12;
        assertEquals(actual1,expected1);

        int actual2 = calculatorService.multiply(59, -14);
        int expected2 = 59 * (-14);
        assertEquals(actual2,expected2);
    }

   @Test
   void divide() {
       var actual1 = calculatorService.divide(24, 12);
       var expected1 = 24 / 12;
       assertEquals(actual1,expected1);

       var actual2 = calculatorService.divide(124, 5);
       var expected2 = 124 / 5;
       assertEquals(actual2,expected2);

       assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(11, 0));
    }

}