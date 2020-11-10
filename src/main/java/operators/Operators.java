package operators;

public class Operators {
    public boolean isEven(int n) {
        boolean even = false;
        if (n % 2 == 0) {
            even = true;
        }
        return  even;
    }

    public String multiplyByPowerOfTwo(int n, int pow) {
        String number = Integer.toBinaryString(n << pow);
        return number;
    }

}
