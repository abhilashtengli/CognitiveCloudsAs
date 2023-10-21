package Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i : a) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.print(even);
        System.out.println();
        System.out.print(odd);
        
    }
}
