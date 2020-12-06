package lab3;

public abstract class Furniture {
    private int cost;
    private String color;
    private String description;

    public Furniture(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + " " + description + " by $" + cost;
    }
}
