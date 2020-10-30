package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Store store = new Store("GPU");

        store.store(20);

        System.out.println(store.getStock());

        store.dispatch(10);

        System.out.println(store.getStock());
    }

}
