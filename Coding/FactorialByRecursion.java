package Coding;

public class FactorialByRecursion {

    public static void main(String[] args) {
        int n = 5;
        int factorial = fact(n);
        System.out.println(factorial);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
