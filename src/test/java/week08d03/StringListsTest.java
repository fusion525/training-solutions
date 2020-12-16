package week08d03;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;

public class StringListsTest {

    @Test
    public void stringListUnionTest() {

        List<String> first = new ArrayList<>();
        first.add("Audi");
        first.add("Seat");
        first.add("Volvo");
        first.add("Mercedes");

        List<String> second = new ArrayList<>();
        second.add("Suzuki");
        second.add("Tesla");
        second.add("Volvo");
        second.add("Renault");

        List<String> unionTest = new ArrayList<>();
        unionTest.add("Audi");
        unionTest.add("Seat");
        unionTest.add("Volvo");
        unionTest.add("Mercedes");
        unionTest.add("Suzuki");
        unionTest.add("Tesla");
        unionTest.add("Renault");

        assertEquals(unionTest, StringLists.stringListUnion(first,second));
    }

}
