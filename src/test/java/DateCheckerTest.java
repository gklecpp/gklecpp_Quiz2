import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateCheckerTest {

    @Test
    void testJanHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(checker.has31Days(Month.JANUARY), "January should have 31 days");
    }

    @Test
    void testAprDoesntHave31Days() {
        DateChecker checker = new DateChecker();

        assertFalse(checker.has31Days(Month.APRIL), "April should not have 31 days");
    }

    @Test
    void testMarHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(checker.has31Days(Month.MARCH), "March should have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "JANUARY",
            "MARCH",
            "MAY",
            "JULY",
            "AUGUST",
            "OCTOBER",
            "DECEMBER"
    })
    void testMonthsWith31Days(Month month) {
        DateChecker checker = new DateChecker();

        assertTrue(checker.has31Days(month), month + " should have 31 days");
    }

    @Test
    void testFebDoesntHave31Days(){
        DateChecker checker = new DateChecker();

        assertFalse(checker.has31Days(Month.FEBRUARY), "February should not have 31 days");
    }

    @Test
    void testMonthThrowsException(){
        DateChecker checker = new DateChecker();

        assertThrows(IllegalArgumentException.class, () -> checker.has31Days(null), "Null month should throw an exception");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "APRIL",
            "JUNE",
            "SEPTEMBER",
            "NOVEMBER"
    })

    void testMonthsWithout31Days(Month month){
        DateChecker checker = new DateChecker();

        assertFalse(checker.has31Days(month), month + " should not have 31 days");
    }
}
