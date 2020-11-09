package primitivetypes;

public class PrimitiveTypes {

    public static final int NUMBER_OF_BITS = 32;

    public String toBinaryString(int n) {
        String result = "";
        while (n>0) {
            int a = n % 2;
            n = n/2;
            result = a + "" + result;

        }
        return result;
    }
}
