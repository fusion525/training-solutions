package exam02;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {

    public String selectEvens(int[] numbers) {

        StringBuilder textBuilder = new StringBuilder();

        textBuilder.append("[");
        textBuilder.append(numbers[0]);

        for (int i = 2; i < numbers.length; i++) {

            if (i % 2 == 0) {
                textBuilder.append(", ");
                textBuilder.append(numbers[i]);
            }
        }
        return textBuilder + "]";

    }
}
