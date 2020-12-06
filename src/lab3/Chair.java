package lab3;

public class Chair extends Furniture {

    private int old;

    public Chair(String color, int old) {
        super(50, color);
        super.setDescription("Chair");

        this.old = old;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
