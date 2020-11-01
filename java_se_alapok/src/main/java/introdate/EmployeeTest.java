package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the name of the Employee:");
        String name = scanner.nextLine();
        System.out.println("Please provide the date of birth of the employee");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day= scanner.nextInt();

        Employee firstEmployee = new Employee(year, month, day, name);

        System.out.println(firstEmployee.getName());
        System.out.println(firstEmployee.getDateOfBirth());
        System.out.println(firstEmployee.getBeginEmployment());


    }
}
