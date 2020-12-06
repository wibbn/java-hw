package lab2;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Hand {
    private int strength;
    private int skillful = 0; // [0-100]

    public Hand(int strength) {
        this.strength = strength;
    }

    public void increaseSkill(int a) {
        this.skillful = max(this.skillful + a, 100);
    }

    public void decreaseSkill(int a) {
        this.skillful = min(this.skillful - a, 0);
    }
}