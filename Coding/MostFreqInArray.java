package Coding;

import java.util.HashMap;
import java.util.Map;

public class MostFreqInArray {

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 5, 5, 5, 2 };

        int ans = mostFreqArr(a);
        System.out.println(ans);
    }

    private static int mostFreqArr(int[] a) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int max = 0;
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
