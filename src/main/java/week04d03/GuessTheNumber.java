package week04d03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {

    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while (i<6) {

            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Bigger");
                i++;
            }
            if (guess > randomNumber) {
                System.out.println("Lower");
                i++;
            }
            if (guess == randomNumber) {
                System.out.println("You won");
                i++;
            }
        }
    }

}
