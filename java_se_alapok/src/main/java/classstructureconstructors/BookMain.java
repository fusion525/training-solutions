package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("George Orwell", "1984");

        book.register("ISBN12333");

        System.out.println(book.getAuthor() + ' ' + book.getTitle() + " " + book.getRegNumber() );
    }
}
