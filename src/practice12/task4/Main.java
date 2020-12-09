package practice12.task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("From international: ");
        System.out.println(Phone.fromInternational("+78005553535").toUnique());

        System.out.println("From *RUSSIAN*:");
        System.out.println(Phone.fromRussian("88007772727").toUnique());
    }
}
