import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> catalog = new ArrayList<>();

    public FurnitureShop() {
        fillCatalog();
        printCatalog();
    }

    private void fillCatalog() {
        catalog.add(new Chair("white"));
        catalog.add(new Bookshelf("white"));
    }

    private void printCatalog() {
        System.out.println("Furniture shop catalog:");
        int total = 0;
        for (int i=0; i<catalog.size(); i++) {
            System.out.println(catalog.get(i));
            total += catalog.get(i).getCost();
        }
        System.out.println('With total: $' + total)
    }
}
