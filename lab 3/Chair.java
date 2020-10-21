public class Chair extends Furniture {

    private int old = 0;

    public Chair(String color, int old) {
        super(50, color);
        super.setDescription("Chair");

        this.old = old;
    }

    public int getOld() {
        return cost;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
