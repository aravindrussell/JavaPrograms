package org.example.BasicJavaQuestions;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of parentheses: ");
        String input = scanner.nextLine();

        if (isValidParentheses(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidParentheses(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


}
