public class House implements Pricable {
    private int price;
    public House(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
