package week10d02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxTravel {

    private List<Integer> stops;

    public MaxTravel(List<Integer> stops) {
        this.stops = stops;
    }

    public static int maxIndex(List<Integer> list) {
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                maxIndex = list.indexOf(max);
            }
        }
        return maxIndex;
    }

    public int getMaxIndex() {

        this.stops.sort(Comparator.reverseOrder());

        List<Integer> maxStops = new ArrayList<>();

        int i = 0;
        int sum = 1;

        while (i < this.stops.size()-1) {

            if (this.stops.get(i) == this.stops.get(i+1)) {
                sum++;
            }
            else {
                maxStops.add(sum);
                sum = 1;
            }
            i++;
        }

        System.out.println(maxStops);

        return maxIndex(maxStops);
    }

    public static void main(String[] args) {

        List<Integer> travels = new ArrayList<>();

        travels.add(12);
        travels.add(3);
        travels.add(3);
        travels.add(4);
        travels.add(3);
        travels.add(0);
        travels.add(12);
        travels.add(12);
        travels.add(1);
        travels.add(12);
        travels.add(12);
        travels.add(0);
        travels.add(4);
        travels.add(0);
        travels.add(0);

        MaxTravel maxTravel = new MaxTravel(travels);

        travels.sort(Comparator.reverseOrder());

        System.out.println(travels);

        System.out.println(maxTravel.getMaxIndex());


    }



}
