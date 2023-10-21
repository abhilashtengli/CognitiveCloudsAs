package Coding;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String input) {
        char[] ch = input.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return new String(ch);
    }
}
