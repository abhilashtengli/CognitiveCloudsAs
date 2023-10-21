package Coding;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "programming";

        char firstNonRepeated = find(input);

        if (firstNonRepeated != '0') {
            System.out.println(firstNonRepeated);
        } else {
            System.out.println("No non-repeated characters found.");
        }
    }

    public static char find(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : input.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '0';
    }
}
