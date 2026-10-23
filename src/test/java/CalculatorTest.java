import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void testSumPositiveNumbers(){
        Calculator calculator = new Calculator();

        assertEquals(8, calculator.sum(5,3), "5 + 3 should equal 8");
    }
}
