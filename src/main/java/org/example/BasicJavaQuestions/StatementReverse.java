package org.example.BasicJavaQuestions;

import java.util.Scanner;

public class StatementReverse {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String reversedSentence = reverseWords(input);
        System.out.println("Output: " + reversedSentence);

    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverse(word);
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }

    public static String reverse(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }

}
