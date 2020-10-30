package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Please provide the author of the song!");
        song.band = scanner.nextLine();
        System.out.println("Please provide the title of the song!");
        song.title = scanner.nextLine();
        System.out.println("Please provide the length of the song in minutes!");
        song.length = scanner.nextInt();

        System.out.println(song.band + " - " + song.title + ", " + song.length + " minutes");

    }
}
