public class Body {
    private double size;
    private double weight;

    private int healthLevel;

    public Body(double size, double weight) {
        this.size = size;
        this.weight = weight;

        this.healthLevel = 100;
    }

    public int liveAYear() {
        this.healthLevel -= 1;
    }
}