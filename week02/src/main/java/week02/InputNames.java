package week02;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        String[] nevek = new String[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            nevek[i] = scanner.nextLine();

        }

        for (int i = 0; i<5; i++) {
            System.out.println(i + "." + " elem: " + nevek[i] );
        }
    }
}
