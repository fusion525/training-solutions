package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store (String product) {
        this.product = product;
        this.stock = 0;
    }

    public void store(int pc) {
        this.stock +=pc;
    }

    public void dispatch(int pc) {
        this.stock -=pc;
    }

    public int getStock() {
        return stock;
    }


}
