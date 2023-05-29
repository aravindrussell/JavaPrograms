package org.example.BasicJavaQuestions;

public class ArgsLength {

    String args[] = {"1", "2"};

    public static void main(String args[]) {
        System.out.println("In main method");
        if (args.length > 0)
            System.out.println(args.length);
    }

}
