package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductNyCategoryName(Category category) {
        int found = 0;
        for (Product product : productList ) {
            if (product.category.equals(category)) {
                found++;
            }
        }

        return found;
    }

    public static void main(String[] args) {

        Product product1 = new Product("Bread",Category.BAKEDGOODS,200);
        Product product2 = new Product("Croissant",Category.BAKEDGOODS, 250);
        Product product3 = new Product("Donut",Category.BAKEDGOODS, 300);
        Product product4 = new Product("Cookie",Category.BAKEDGOODS, 240);
        Product product5 = new Product("Mineral water",Category.OTHER, 99);
        Product product6 = new Product("Ginger Ale",Category.OTHER, 120);


        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);


        Store store = new Store(list);

        System.out.println(store.getProductNyCategoryName(Category.BAKEDGOODS));
        System.out.println(store.getProductNyCategoryName(Category.OTHER));
    }

}
