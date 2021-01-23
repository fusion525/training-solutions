package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    public static int startsWithA(List<String> words) {

        int counter = 0;

        if (words.isEmpty()) {
            return counter;
        }
        else {
            for (String word : words) {
                if (word.startsWith("a") || word.startsWith("A")) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
