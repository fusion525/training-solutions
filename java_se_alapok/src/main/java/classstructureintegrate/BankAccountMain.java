package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the owner of the first bank account");
        String owner = scanner.nextLine();
        System.out.println("Please enter the number of the first bank account");
        String accountNumber = scanner.nextLine();
        System.out.println("Please enter the balance of the first bank account");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount first = new BankAccount(accountNumber, owner, balance);

        System.out.println("Please enter the owner of the second bank account");
        String owner2 = scanner.nextLine();
        System.out.println("Please enter the number of the second bank account");
        String accountNumber2 = scanner.nextLine();
        System.out.println("Please enter the balance of the second bank account");
        int balance2 = scanner.nextInt();
        scanner.nextLine();

        BankAccount to = new BankAccount(accountNumber2, owner2, balance2);

        System.out.println("Amount of Deposit:");
        first.deposit(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Amount of Withdraw:");
        first.withdraw(scanner.nextInt());
        scanner.nextLine();

        first.getInfo();

    }
}
