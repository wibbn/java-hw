public class Human {
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHandl
    private Body body;
    private Head head;

    public Human(double height, double weight, String hairColor) {
        this.leftLeg = new Leg(length=height/2);
        this.rightLeg = new Leg(length=height/2);

        this.leftHand = new Hand(strength=10);
        this.rightHand = new Hand(strength=10);

        this.body = new Body(size=height/2, weight=weight);

        this.head = new Head(hairColor=hairColor);
    }

    public void smallTalk(int length) {
        for (int i=0; i<length; i++) {
            this.head.toggleMouth();
        }
    }

    public void run(int distance) {
        for(int i=0; i<distance; i++) {
            if (i % 2 == 0) {
                this.leftLeg.stepForward();
            } else {
                this.rightHand.stepForward();
            }
        }
    }
}