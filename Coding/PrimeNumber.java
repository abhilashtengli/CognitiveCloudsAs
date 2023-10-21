package Coding;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 5, 7, 10, 11, 20, 23, 14, 6, 13, 17, };

        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
