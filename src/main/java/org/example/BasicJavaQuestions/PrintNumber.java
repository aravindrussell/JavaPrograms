package org.example.BasicJavaQuestions;

public class PrintNumber {

    public static void PrintNumberWithUsingNumber(){
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }
    }

    public static void PrintNumberWithoutUsingNumber(){
        int one = 'A'/'A';
        String multipleString = "..........";

        for (int i=one; i<=multipleString.length() * multipleString.length(); i++){
            System.out.println(i);
        }
    }

    public static void PrintNumberWithAnsiiValue(){
        for (int i=1; i<='d'; i++){
            System.out.println(i);
        }
    }

    public static void PrintWithoutLoop(int num){
        if (num <= 100){
            System.out.println(num);
            num++;
            PrintWithoutLoop(num);
        }
    }

    public static void main (String[] args){
        PrintWithoutLoop(1);
    }
}
