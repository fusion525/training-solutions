package week08d05;

public class MathAlgorithms {

    public static int greatestCommonDivisor(int m, int n) {

        if (!(m > 0 && n > 0)) {
            throw new IllegalArgumentException("Please provide positive integers!");
        }

        int d = n;
        int c = m;

        while (c != d) {

            if (c < d) d = d - c;
            else if (c > d) c = c - d;

        }

        return d;
    }

}
