package week05d05;

import java.util.StringJoiner;

public class User {

    private String firstname;
    private String lastname;
    private String email;


    public User(String firstname, String lastname, String email) {
        final String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        this.firstname = firstname;
        this.lastname = lastname;

        if (email.matches(emailRegex)) {
            this.email = email;
        }
        else {
            throw new IllegalStateException("Invalid e-mail format!");
        }

    }

    public String getName() {
        StringJoiner nameJoiner = new StringJoiner(" ");
        nameJoiner.add(firstname).add(lastname);
        String fullName = nameJoiner.toString();

        return fullName;
    }

}
