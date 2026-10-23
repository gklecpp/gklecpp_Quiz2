import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    @Test
    void testJanHas31Days(){
        DateChecker checker = new DateChecker();

        assertTrue(checker.has31Days(Month.JANUARY), "January should have 31 days");
    }
}
