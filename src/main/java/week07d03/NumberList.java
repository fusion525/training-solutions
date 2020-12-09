package week07d03;

import java.util.ArrayList;
import java.util.List;

public class NumberList {

    public static boolean isIncreasing(List<Integer> numbers) {

        int i = 0;

        boolean isIncreasing = true;

        while (isIncreasing && i<numbers.size()-1) {

            if (numbers.get(i) > numbers.get(i+1)) {

                isIncreasing = false;

            }
            i++;
        }
        return isIncreasing;
    }

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);

        List<Integer> numbersDesc = new ArrayList<>();

        numbersDesc.add(5);
        numbersDesc.add(5);
        numbersDesc.add(5);
        numbersDesc.add(2);
        numbersDesc.add(1);


        System.out.println(isIncreasing(numbers));
        System.out.println(isIncreasing(numbersDesc));


    }

}
