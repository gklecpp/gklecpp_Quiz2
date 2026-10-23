import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    @Test
    void testSumPositiveNumbers(){
        Calculator calculator = new Calculator();

        assertEquals(8, calculator.sum(5,3), "5 + 3 should equal 8");
    }

    @Test
    void testSumNegativeNumbers(){
        Calculator calculator = new Calculator();

        assertEquals(-8, calculator.sum(-5, -3), "-5 + -3 should equal -8");
    }

    @Test
    void testSumWithZero() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.sum(5, 0), "5 + 0 should equal 5");
    }

    @Test
    void testSubtractPositiveNumbers(){
        Calculator calculator = new Calculator();

        assertEquals(7, calculator.subtract(10, 3), "10 - 3 should equal 7");
    }

    @Test
    void testMultiplyPositiveNumbers(){
        Calculator calculator = new Calculator();

        assertEquals(20, calculator.multiply(4, 5), "4 * 5 should equal 20");
    }

    @Test
    void testDividePositiveNumbers(){
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.divide(10, 2), "10 / 2 should equal 5");
    }

    @Test
    void testDivideByZero(){
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw an exception");
    }

    @Test
    void testIsEvenWithEvenNumber() {
        Calculator calculator = new Calculator();

        assertTrue(calculator.isEven(4), "4 should be even");
    }

    @Test
    void testIsEvenWithOddNumber(){
        Calculator calculator = new Calculator();
        assertFalse(calculator.isEven(7), "7 should not be even");
    }

    @Test
    void testIsEvenWithZero(){
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEven(0), "0 should not be even");
    }

    @Test
    void testIsEvenWithNegativeNumber(){
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEven(-6), "-6 should not be even");
    }

    @Test
    void testSubtractNegativeNumbers(){
        Calculator calculator = new Calculator();

        assertEquals(-2, calculator.subtract(-5, -3), "-5 - (-3) should equal -2");
    }

    @Test
    void testMultiplyByZero(){
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.multiply(5, 0), "5 * 0 should equal 0");
    }

    @Test
    void testMultiplyNegativeNumbers(){
        Calculator calculator = new Calculator();

        assertEquals(-20, calculator.multiply(-4, 5), "-4 * 5 should equal -20");
    }
}
