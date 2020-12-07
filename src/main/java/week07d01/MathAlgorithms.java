package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int x) {

        return countDividers(x) == 2;

    }

    public static int countDividers(int x) {

        int sum = 0;
        for (int i = 1; i<=x; i++) {

            if (isDividend(x,i)) {
                sum++;
            }
        }
        return sum;
    }

    public static boolean isDividend(int x, int divider) {

        return x % divider == 0;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(-3));
    }

}
