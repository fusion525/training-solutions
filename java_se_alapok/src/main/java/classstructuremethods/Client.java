package classstructuremethods;

public class Client {
    private String name;
    private int year;
    private String address;

    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getYear() {
        return year;
    }
    public int setYear(int year) {
        this.year = year;
        return year;
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        this.address = address;
        return address;
    }

    public String migrate(String address) {
        this.address = address;
        return address;
    }
}
