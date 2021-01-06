package week10d02;

import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> passengers) {

        int[] passengerSum = new int[30];

        int maxIndex = 0;
        int maxValue = 0;

        for (int passenger : passengers) {
            passengerSum[passenger] ++;
        }
        for (int i = 0; i < passengerSum.length; i++) {
            if (passengerSum[i] > maxValue) {
                maxValue = passengerSum[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

}
