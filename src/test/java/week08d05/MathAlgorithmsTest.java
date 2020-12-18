package week08d05;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void greatestCommonDivisorTest8() {
        assertEquals(8, week08d05.MathAlgorithms.greatestCommonDivisor(8,8));
    }

    @Test
    public void greatestCommonDivisorTest3() {
        assertEquals(3, week08d05.MathAlgorithms.greatestCommonDivisor(3,24));
    }

    @Test
    public void greatestCommonDivisorTest138() {
        assertEquals(2, week08d05.MathAlgorithms.greatestCommonDivisor(138,52));
    }

}
