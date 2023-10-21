package Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelsConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        sc.close();

        List<Character> v = new ArrayList<>();
        List<Character> c = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v.add(ch);
                } else {
                    c.add(ch);
                }
            }
        }

        System.out.println("vowels :" + v);
        System.out.println("Consonants :" + c);
        ;
    }
}
