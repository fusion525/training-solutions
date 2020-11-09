package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class IntroDateMain {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.MARCH, 31);

        LocalDateTime date2 = LocalDateTime.of(2020,11,1,11,01);

        LocalDateTime date3 = LocalDateTime.now();
        System.out.println(date3);
    }

}
