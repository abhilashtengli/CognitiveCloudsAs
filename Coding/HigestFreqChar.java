package Coding;

import java.util.HashMap;
import java.util.Map;

public class HigestFreqChar {
    public static void main(String[] args) {

        String input = "pdhrhbhhsfgrstgbef";
        char highestFrequencyChar = find(input);

        System.out.println(highestFrequencyChar);
    }

    public static char find(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        char highestFrequencyChar = '0';
        int max = 0;

        // Find the character with the highest frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                highestFrequencyChar = entry.getKey();
            }
        }

        return highestFrequencyChar;
    }
}
