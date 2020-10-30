package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Client client = new Client();
        System.out.println("Please provide name of the client");
        client.setName(scanner.nextLine());
        System.out.println("Please provide the client's date of birth");
        client.setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Please provide the address of the client");
        client.setAddress(scanner.nextLine());
        System.out.println(client.getName() + ' ' + client.getYear() + ' ' + client.getAddress());
        System.out.println("Please Provide the new address of client");
        client.migrate(scanner.nextLine());
        System.out.println("The new address is:" + client.getAddress());

    }
}
