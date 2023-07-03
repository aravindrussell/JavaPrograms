package org.example.BasicJavaQuestions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UniqueSubString {


    public static void main (String args[]){
        String s = "zyzyzyz";
        System.out.println(UniqueSubString.distinctSubString(s));
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
