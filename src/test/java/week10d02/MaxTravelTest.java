package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void getMaxIndexTest() {

        assertEquals(12, new MaxTravel().getMaxIndex(List.of(0,1,12,3,0,0,12,5,6,12,1,12,12)));

    }
}