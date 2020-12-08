package week07d02;

import java.util.ArrayList;
import java.util.List;

public class DigitSum {

    public static int sumOfDigits(int x) {

        int sum = 0;

        List<Integer> digits = new ArrayList<>();

        while (x > 0) {

            digits.add(x % 10);
            x = x / 10;

        }

        for (int digit : digits) {

            sum += digit;

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(3456));
        System.out.println(sumOfDigits(99));
        System.out.println(sumOfDigits(2332434));
    }

}
