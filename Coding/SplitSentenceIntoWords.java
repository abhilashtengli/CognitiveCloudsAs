package Coding;

public class SplitSentenceIntoWords {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
