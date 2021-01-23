package week03d04;

public class PhoneParser {

    public static Phone parse(String telNumber) {

        String prefix = telNumber.substring(0,2);
        String number = telNumber.substring(3,10);

        Phone phone = new Phone(prefix, number);

        return phone;
    }

    public static void main(String[] args) {
        System.out.println(parse("10-1234567").getPrefix());
        System.out.println(parse("10-1234567").getNumber());
    }

}
