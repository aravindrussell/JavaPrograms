package org.example;

import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.util.*;

public class Sample {

    public static void main(String args[]){

        String sel = "ilikeselenium";

        Map<Character,Integer> dup = new HashMap<>();

        for (int i=0;i<sel.length();i++){
            char ch = sel.charAt(i);
            if (dup.containsKey(ch)){
                dup.put(ch,dup.get(ch) + 1);
            } else {
                dup.put(ch,1);
            }
        }

        List<Character> so = new LinkedList(dup.keySet());
        Collections.sort(so);

        Map<Character,Integer> dup1 = new LinkedHashMap<>();
        for (char s : so){
            dup1.put(s,dup.get(s));
        }
        System.out.println(dup1);
    }
//    TakesScreenshot tk = (TakesScreenshot) driver;
}
