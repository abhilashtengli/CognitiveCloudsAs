package Coding;

public class FindTargetIndex {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int[] x = { 1, 6, 8, 9, 5 };

        int idx = find(x, a, b);

        if (idx != -1) {
            System.out.println(idx);
        } else {
            System.out.println("No index found.");
        }
    }

    public static int find(int[] x, int a, int b) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] + a == b) {
                return i;
            }
        }
        return -1;
    }
}
