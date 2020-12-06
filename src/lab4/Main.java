package lab4;

public class Main {

    public static void main(String[] args) {
	    Pricable p1 = new House(300000);
	    Pricable p2 = new Car(23900);

        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());
    }
}
