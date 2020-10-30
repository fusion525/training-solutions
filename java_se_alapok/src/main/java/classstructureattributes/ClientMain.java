package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Client client = new Client();

        System.out.println("Please provide the name of the client!");
        client.name = scanner.nextLine();
        System.out.println("Please provide client's year of birth!");
        client.YearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please provide the address of the client!");
        client.address = scanner.nextLine();

        System.out.println(client.name + ' ' + client.YearOfBirth + ' ' + client.address);
    }
}
