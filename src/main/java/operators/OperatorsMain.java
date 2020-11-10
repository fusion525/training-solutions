package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(operators.isEven(5));

        String number = Integer.toBinaryString(16 >> 1);
        System.out.println(number);

        number = Integer.toBinaryString(13 >> 1);
        System.out.println(number);

        System.out.println(operators.multiplyByPowerOfTwo(4,2));


    }



}
