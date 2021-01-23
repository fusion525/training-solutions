package week02d04;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i<5; i++) {

            names[i] = scanner.nextLine();

        }

        for (String name : names) {
            System.out.println(name);
        }

    }

}
