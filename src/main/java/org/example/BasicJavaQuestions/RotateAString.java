package org.example.BasicJavaQuestions;

import org.apache.commons.lang3.StringUtils;

public class RotateAString {

    public static void main(String[] args) {

        // Example 1
        String s = "[";
        int numberOfTimes = 2;
        System.out.printf("The output of StringUtils.rotate() for the string - '%s' is '%s'", s, StringUtils.rotate(s, numberOfTimes));
        System.out.println();
    }
}
