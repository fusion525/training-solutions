package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1989,06,02);
        LocalTime startTime = LocalTime.of(18,00);
        LocalTime endTime = LocalTime.of(20,00);
        String artist = "Queen";

        Performance performance = new Performance(artist,date,startTime,endTime);

        performance.getInfo();

    }

}
