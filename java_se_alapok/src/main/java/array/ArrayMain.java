package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain {


    public static void main(String[] args) {


        String[] DaysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(DaysOfWeek[1]);
        System.out.println(DaysOfWeek.length);

        int[] PowOfTwo = new int[5];

        for (int i = 0; i < PowOfTwo.length; i++) {
            if (PowOfTwo[0] == 0) {
                PowOfTwo[0] = 1;
            } else {
                PowOfTwo[i] = 2 * PowOfTwo[i - 1];
            }

            System.out.println(PowOfTwo[i]);

        }

        boolean[] booleans = new boolean[6];

        for (int i = 1; i < booleans.length; i = i+2) {
            booleans[i] = true;
        }

        for (boolean item: booleans ) {
            System.out.println(item);
        }

        String[] numberOfDays = {"31", "29", "31", "30", "31", "31", "31", "30", "31", "31", "30", "31"};
        System.out.println(Arrays.toString(numberOfDays));

        String[] daysOfWeek = {"Monday", "Tuesday", "Thursday", "Friday", "Saturday", "Sunday" };

        System.out.println(Arrays.asList(daysOfWeek));
    }





}


