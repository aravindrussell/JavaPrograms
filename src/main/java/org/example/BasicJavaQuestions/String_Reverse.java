package org.example.BasicJavaQuestions;

public class String_Reverse {

    public static void main(String[] ags) {
        String orgString = "Ashmita Aravind Russell V";
        System.out.println("Original String : " + orgString);
        System.out.println("Reverse String : " + reverseStringUsingBuilder(orgString));
        System.out.println("Reverse String : " + reverseGivenString(orgString));
    }

    public static String reverseGivenString(String value){
        char ch;
        String reverseString = "";
        for (int i=0; i < value.length(); i++){
            ch = value.charAt(i);
            reverseString = ch + reverseString;
        }
        return reverseString;
    }

    public static String reverseStringUsingBuilder(String value){
        StringBuilder stringBuilder = new StringBuilder(value);
        return stringBuilder.reverse().toString();
    }
}