package classstructureio;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Kérem adja meg az első egész számot");
        int num1 = scanner.nextInt();
        System.out.println("Kérem adja meg a második egész számot");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2);
        System.out.println(num1 + num2);
    }
}
