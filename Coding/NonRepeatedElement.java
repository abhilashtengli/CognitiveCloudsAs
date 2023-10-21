package Coding;

import java.util.HashMap;

public class NonRepeatedElement {

    public static void main(String[] args) {

        int a[] = { 5, 2, 3, 5, 5, 5, 2 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) == 1) {
                System.out.println(a[i]);
                return;
            }
        }

    }

}
