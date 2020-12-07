package week07d01;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static week07d01.MathAlgorithms.isPrime;

public class TestMathAlgorithms {

    @Test
    public void TestisPrime() {

         assertTrue(isPrime(7));
         assertTrue(isPrime(2));
         assertTrue(isPrime(13));
         assertTrue(isPrime(3));
         assertFalse(isPrime(14));
         assertFalse(isPrime(-3));

    }

}
