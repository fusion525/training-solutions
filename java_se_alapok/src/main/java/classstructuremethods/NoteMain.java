package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        System.out.println("Please provide Username!");
        note.setName(scanner.nextLine());
        System.out.println("Please provide a topic for your note");
        note.setTopic(scanner.nextLine());
        System.out.println("Enter text here:");
        note.setText(scanner.nextLine());

        System.out.println(note.getNoteText());

    }

}
