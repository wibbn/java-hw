public class Cabinet extends Furniture {
    private double volume;

    public Cabinet(String color, double volume) {
        super(1000, color);
        setDescription("Cabinet");
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
