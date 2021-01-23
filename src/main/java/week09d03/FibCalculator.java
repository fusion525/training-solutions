package week09d03;

import java.util.ArrayList;
import java.util.List;

public class FibCalculator {

    public static List<Integer> fibGenerator(int bound) {

        List<Integer> fibNumbers = new ArrayList<>();

        fibNumbers.add(1);
        fibNumbers.add(1);

        int i = 1;

        while(fibNumbers.get(i) < bound) {

            fibNumbers.add(fibNumbers.get(i-1) + fibNumbers.get(i));

            i++;
        }

        return fibNumbers;
    }

    public static long sumEvens(int bound) {

        long sum = 0;

        List<Integer> fibNumbers = fibGenerator(bound);

        for (int number : fibNumbers) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }
        return sum;
    }

}
