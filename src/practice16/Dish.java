package practice16;

import practice16.utils.Item;

public class Dish implements Item, Comparable<Dish>{
    private final int cost;
    private final String name;
    private final String description;

    public Dish(int cost, String name, String description) throws IllegalArgumentException {
        if (name.isEmpty() || description.isEmpty() || cost < 0)
            throw new IllegalArgumentException();

        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dish o) {
        return Double.compare(this.cost, o.cost);
    }
}
