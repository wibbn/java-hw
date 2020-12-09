package practice16;

import practice16.utils.Item;

public class Drink implements Item, Comparable<Drink> {

    private final int cost;
    private final String name;
    private final String description;

    public static final int DEFAULT_COST = 0;

    public Drink(String name, String description) throws IllegalArgumentException {
        if (name.isEmpty() || description.isEmpty())
            throw new IllegalArgumentException();

        this.cost = DEFAULT_COST;
        this.name = name;
        this.description = description;
    }

    public Drink(int cost, String name, String description) {
        if (name.isEmpty() || description.isEmpty() || cost < 0)
            throw new IllegalArgumentException();

        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Drink o) {
        return Double.compare(this.cost, o.cost);
    }
}
