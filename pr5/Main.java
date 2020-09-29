import java.util.Scanner;

public class Main {
    public static int Ex11() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x == 0) {
            return 0;
        }

        int s = Ex11();

        if (s == 0) {
            int s1 = Ex11();

            if (s1 == 0) {
                return 1;
            } else {
                return s1 + 1;
            }
        } else {
            return s + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Ex11());
    }
}