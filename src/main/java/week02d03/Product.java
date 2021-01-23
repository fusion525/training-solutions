package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public boolean areTheyEqual(Product product) {

        return product.getName().equals(this.name);

    }

    public static void main(String[] args) {
        Product product = new Product("keksz", "123");
        Product product2 = new Product("keksz", "1234");
        Product product3 = new Product("nemKeksz", "1234");

        System.out.println(product.areTheyEqual(product3));
        System.out.println(product.areTheyEqual(product2));
    }
}
