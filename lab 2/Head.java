public class Head{
    private String hairColor = "brown";

    private bool mouthIsOpen = false;

    public Head(String hairColor) {
        this.hairColor = hairColor;
    }

    public void openMouth() {
        this.mouthIsOpen = true;
    }

    public void closeMouth() {
        this.mouthIsOpen = false;
    }

    public void toggleMouth() {
        this.mouthIsOpen = !this.mouthIsOpen;
    }
}