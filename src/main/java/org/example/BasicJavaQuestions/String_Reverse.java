package org.example.BasicJavaQuestions;

public class String_Reverse {

    public static void main(String[] ags) {

        String_Reverse string_reverse = new String_Reverse();
        String orgString = "Russell";
        System.out.println("Original String : " + orgString);

        System.out.println("Reverse String : " + string_reverse.reverseGivenString(orgString));
    }

    public String reverseGivenString(String value){
        char ch;
        String reverseString = "";
        for (int i=0; i < value.length(); i++){
            ch = value.charAt(i);
            reverseString = ch + reverseString;
        }
        return reverseString;
    }
}