public class Main {
    public void factorial(int n) {
        int res = 1;
        for (int i=2; i<=n; i++) {
            res *= i;
        }
        return res;
    }

    public void main() {
        System.out.println(factorial(10));
    }
}