package org.example.BasicJavaQuestions;

import java.util.*;

public class UniqueSubString {


    public static void main (String args[]){
        String s = "abaaba";
        System.out.println(UniqueSubString.distinctSubString(s));
    }

    public static void getUniqueValueInList(){

    }

    public static Integer distinctSubString(String str){
        Set<String> result = new HashSet<String>();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                result.add(str.substring(i, j));
            }
        }
        System.out.println(result);
        return result.size();
    }
}
