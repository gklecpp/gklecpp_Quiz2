import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        assertEquals(20, calculator.subtract(4, 5), "4 * 5 should equal 20");
    }
}
