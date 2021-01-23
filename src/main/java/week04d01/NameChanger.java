package week04d01;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {

        if(fullName.equals("") || fullName.equals(null)) {
            throw new IllegalArgumentException("Invalid name" + fullName);
        }
        else {
            this.fullName = fullName;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void changeFirstName(String firstName) {

        int firstNameLength = this.fullName.indexOf(" ");

        String newFullName = firstName + this.fullName.substring(firstNameLength);

        this.fullName = newFullName;

    }

    public static void main(String[] args) {
        NameChanger nameChanger = new NameChanger("Kovács Vera");

        nameChanger.changeFirstName("Bencsik");

        System.out.println(nameChanger.getFullName());
    }

}
