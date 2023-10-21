package Coding;

public class FiboNth {
    public static void main(String[] args) {

        int n = 5;

        int result = NthFibo(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    private static int NthFibo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int first = 0, second = 1, nthFibo = 0;

        for (int i = 2; i <= n; i++) {
            nthFibo = first + second;
            first = second;
            second = nthFibo;
        }
        return nthFibo;
    }
}
