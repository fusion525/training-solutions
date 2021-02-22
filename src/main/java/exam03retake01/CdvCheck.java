package exam03retake01;

public class CdvCheck {

    public static boolean check(String cdv) {

        int sum = 0;

        if (cdv.length() != 10) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i<=8; ++i) {

            char temp = cdv.charAt(i);

            String s = Character.toString(temp);

            int digit = Integer.parseInt(s);

            sum += digit * (i + 1);

        }

        String a = cdv.charAt(9) + "";


        if (sum % 11 ==  Integer.parseInt(a)) {
            return true;
        }
        else {
            return false;
        }
    };

}
