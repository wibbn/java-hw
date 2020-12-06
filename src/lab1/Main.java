package lab1;

public class Main {
    public static int factorial(int n) {
        int res = 1;
        for (int i=2; i<=n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}