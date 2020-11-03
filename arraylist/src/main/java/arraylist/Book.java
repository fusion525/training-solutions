package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private List<String> Book = new ArrayList<>();

    public void add(String title){
        Book.add(title);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> found = new ArrayList<>();
        for (String title : Book) {
            if (title.startsWith(prefix)){
                found.add(title);
            }
        }
        return found;
    }

    public List<String> getBook() {
        return Book;
    }

    public static void main(String[] args) {
        Book books = new Book();

        books.add("Antigoné");
        books.add("Egri csillagok");
        books.add("A kis herceg");
        books.add("Egri csillagok");

        System.out.println(books.getBook());

        System.out.println(books.findAllByPrefix("Egri"));

    }

}
