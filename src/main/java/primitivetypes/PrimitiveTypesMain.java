package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        PrimitiveTypes binary = new PrimitiveTypes();

        System.out.println(binary.toBinaryString(2));

        int a = 2;
        System.out.println(Integer.toBinaryString(a));
    }
}
