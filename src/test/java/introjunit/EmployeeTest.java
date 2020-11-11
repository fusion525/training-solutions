package introjunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testCreate() {
        //Given
        Employee employee = new Employee("John", 23);

        //When
        String resultName = employee.getName();

        //Then
        assertEquals("John", resultName);
    }

    @Test
    public void testHaveBirthDay() {

        Employee employee = new Employee("John", 23);

        employee.HaveBirthDay();

        assertEquals(24, employee.getAge());
    }
}
