public class Ball {
    private String color;
    private int pressure;

    public Ball(String c, int p){
        color = c;
        pressure = p;
    }
    public Ball(String c){
        color = c;
        pressure = 0
    }
    public Ball(){
        color = "blue"
        pressure = 0;
    }
    public void colorize(String color) {
        this.color = color;
    }
    public void increasePressure() {
        this.pressure += 1;
    }
    public void decreasePressure(){
        this.pressure -= 1;
    }
    public String toString(){
        return this.color + " ball with " + this.age + " pressure";
    }
}