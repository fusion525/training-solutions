package week09d02;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {

    @Test
    public void testFib() {
        assertEquals(3382, FibCalculator.sumEvens(2584));
        assertEquals(44, FibCalculator.sumEvens(34));
    }
}
