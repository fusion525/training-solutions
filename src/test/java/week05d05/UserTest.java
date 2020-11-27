package week05d05;

import org.junit.Test;
import schoolrecords.ClassRecords;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test

    public void testGetName() {
        assertEquals("Jack Doe", new User("Jack", "Doe", "jack.doe@gmail.com").getName());
    }

    @Test

    public void wrongEmailShouldThrowException() throws IllegalStateException {

        Exception ex = assertThrows(IllegalStateException.class, () -> new User("Jack", "Doe", "wrongEmail"));
        assertEquals("Invalid e-mail format!", ex.getMessage());

    }

}
