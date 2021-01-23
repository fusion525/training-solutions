package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() <= 5) {
            numbers.add(rand.nextInt(90));
        }

        System.out.println(numbers);

    }

}
