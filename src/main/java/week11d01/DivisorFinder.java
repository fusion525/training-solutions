package week11d01;

import java.util.ArrayList;
import java.util.List;

public class DivisorFinder {

    public static int findDivisors(int n) {

        int nCopy = n;
        int divisors = 0;

        List<Integer> numbers = new ArrayList<>();

        do  {
            numbers.add(nCopy%10);
            nCopy = nCopy/10;
        } while (nCopy>1);

        for (int number : numbers) {
            if (n % number == 0) {
                divisors++;
            }
        }
        return divisors;
    }
}
