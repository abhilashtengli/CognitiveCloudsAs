package Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortNumbers {
    public static void main(String[] args) {
        int[] order = { 5, 2, 8, 1, 9, 4 };
        AscendingOrder(order);

        Integer[] reverse = { 5, 2, 8, 1, 9, 4 };
        DescendingOrder(reverse);

        String[] words = { "apple", "banana", "cherry", "date", "fig" };
        sortWords(words);
        
        String[] reverseWords = { "apple", "banana", "cherry", "date", "fig" };
        sortReverse(reverseWords);
    }

    private static void AscendingOrder(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));
    }

    private static void DescendingOrder(Integer[] numbers) {
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Numbers in descending order: " + Arrays.toString(numbers));
    }

    private static void sortWords(String[] words) {
        Arrays.sort(words);
        System.out.println("Words in ascending order: " + Arrays.toString(words));
    }

    private static void sortReverse(String[] reverseWords) {
        Arrays.sort(reverseWords, Comparator.reverseOrder());
        System.out.println("Words in descending order: " + Arrays.toString(reverseWords));
    }
}
