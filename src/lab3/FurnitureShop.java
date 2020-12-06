package lab3;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> catalog = new ArrayList<>();

    public FurnitureShop() {
        fillCatalog();
        printCatalog();
    }

    private void fillCatalog() {
        catalog.add(new Chair("white", 0));
        catalog.add(new Cabinet("white", 100));
    }

    private void printCatalog() {
        System.out.println("Furniture shop catalog:");
        int total = 0;
        for (Furniture i: catalog) {
            System.out.println(i);
            total += i.getCost();
        }
        System.out.println("With total: $" + total);
    }
}