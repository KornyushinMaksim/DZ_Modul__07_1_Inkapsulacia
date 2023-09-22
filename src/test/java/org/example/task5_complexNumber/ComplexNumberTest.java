package org.example.task5_complexNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void summ() {
        ComplexNumber number = new ComplexNumber(20, 8);
        ComplexNumber number1 = new ComplexNumber(2, 4);
        ComplexNumber test = new ComplexNumber(22, 12);
        Assertions.assertEquals(test.getRezD(), number.summ(number1).getRezD());
        Assertions.assertEquals(test.getImzD(), number.summ(number1).getImzD());
    }

    @Test
    void difference() {
        ComplexNumber number = new ComplexNumber(20, 8);
        ComplexNumber number1 = new ComplexNumber(2, 4);
        ComplexNumber test = new ComplexNumber(18, 4);
        Assertions.assertEquals(test.getRezD(), number.difference(number1).getRezD());
        Assertions.assertEquals(test.getImzD(), number.difference(number1).getImzD());

    }

    @Test
    void multiplication() {
        ComplexNumber number = new ComplexNumber(20, 8);
        ComplexNumber number1 = new ComplexNumber(2, 4);
        ComplexNumber test = new ComplexNumber(8, 96);
        Assertions.assertEquals(test.getRezD(), number.multiplication(number1).getRezD());
        Assertions.assertEquals(test.getImzD(), number.multiplication(number1).getImzD());

    }

    @Test
    void comparison() {
        ComplexNumber number = new ComplexNumber(20, 8);
        ComplexNumber number1 = new ComplexNumber(2, 4);
        ComplexNumber test = new ComplexNumber(20, 8);
        Assertions.assertEquals(test.getRezD(), number.comparison(number1).getRezD());
        Assertions.assertEquals(test.getImzD(), number.comparison(number1).getImzD());

    }
}