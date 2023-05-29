package org.example.BasicJavaQuestions;

public class RemoveSpecialCharater {

    public static void main (String[] args){
        String s = "Hello!! Aravind Russell?";

        System.out.println("Original String : " + s);

        System.out.println("Remove Special Char : " + s.replaceAll("[^A-Za-z0-9]",""));

        String asd = "Aravind123Russell456is789interview";

        String q = asd.replaceAll("[^0-9]","");
        char a[] = q.toCharArray();
        System.out.println(q);

        int t = 0;
        for(char c : a){
            int g = (int) c;
            t = t + g;
        }
        System.out.println(t);
    }
}