package localvariables;

public class LocalVariablesMain {

    public void variable() {
        {
            int x = 0;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        boolean b = false;
        System.out.println(b);

        int a = 2;
        int i=3,j=4;
        int k = i;
        String s = "Hello World";
        String t = s;

    }
}
