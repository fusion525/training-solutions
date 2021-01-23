package week10d05;

import java.util.Arrays;

public class Calculator {

    public static int findMinSum(int[] arr) {

        Arrays.sort(arr);
        int minSum = 0;

        for (int i = 0; i<4; i++) {
            minSum += arr[i];
        }
        return minSum;
    }

}
