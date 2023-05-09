package org.example.BasicJavaQuestions;

public class StarPatten {

    public static void main(String[] args){
        RightPatten();
    }

    public static void LeftPatten(){
        for (int i=0; i<=4; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void LeftReversePatten(){
        for (int i=0; i<=4; i++){
            for (int j=4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void CombainLeftPatten(){
        for (int i=0; i<=4; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0; i<=4; i++){
            for (int j=4; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void RightPatten(){
        for (int i=0; i<=4; i++){
            for (int k=3; k>=i; k--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
