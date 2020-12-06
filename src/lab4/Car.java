package lab4;

public class Car implements Pricable {
    private int price;
    public Car(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
