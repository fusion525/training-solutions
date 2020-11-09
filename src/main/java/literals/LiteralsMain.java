package literals;

public class LiteralsMain {

    public static void main(String[] args) {
        double quotient = 3/4;
        System.out.println(quotient);

        float quotient2 = 3/4F;
        System.out.println(quotient2);

        long big = 3_244_444_444L;

        String s = "árvíztűrőtükörfúrógép!";
        System.out.println(s);

        String word = "TITLE";

        word.toUpperCase();

        System.out.println(word);

        int num = 1;
        int num2 =-2;

        String result = Integer.toBinaryString(num);

        System.out.println(result);

        result = Integer.toBinaryString(num2);

        System.out.println(result);
    }
}
