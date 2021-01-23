package week10d01;

import java.util.List;

public class Hiking {

    public static int getPlusElevation(List<Integer> highs) {

        int elevation = 0;

        for (int i = 1; i<highs.size(); i++) {
            if (highs.get(i) > highs.get(i-1)) {
                elevation += highs.get(i) - highs.get(i-1);
            }
        }
        return elevation;
    }

}
