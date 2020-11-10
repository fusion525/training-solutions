package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        PrimitiveTypes binary = new PrimitiveTypes();

        System.out.println(binary.toBinaryString(9));

        int a = 9;
        System.out.println(Integer.toBinaryString(a));
    }
}
