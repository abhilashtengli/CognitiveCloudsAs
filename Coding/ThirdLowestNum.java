package Coding;

import java.util.Arrays;

public class ThirdLowestNum {
    public static void main(String[] args) {
        int[] a = { 10, 5, 19, 8, 25, 3, 16, 12 };
        Arrays.sort(a);

        System.out.println("The 3rd lowest number " + a[2]);
    }
}
