package org.example.BasicJavaQuestions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Locale;

public class PrintWriterExample {

    public static void main(String args[]) throws FileNotFoundException {
        PrintWriter consoleOutput = new PrintWriter(System.out);

        consoleOutput.printf("Hey there! This is %S.\n", "Lubaina Khan");
        consoleOutput.print("Today you're exploring the PrinWriter class with Code Gym. ");
        consoleOutput.println("Hope you're having fun!");
        consoleOutput.append("Patience is the key when learning new concepts.\n");
        consoleOutput.append("It all boils down to practise and persistence. :)");

        consoleOutput.flush();
        consoleOutput.close();


        try {
            // by importing the java.io.PrintWriter class
            PrintWriter fileOutput = new PrintWriter("FileOutput.txt");

            fileOutput.printf(Locale.getDefault(), "Hi, What's the day today? %s.\n", new Date());

            fileOutput.print("Here's an implementation of PrinWriter class for file writing.\n");
            fileOutput.println("Hope Code Gym made it simpler for you to understand.");
            fileOutput.append("One step at a time, and off you go!", 0, 35);

            fileOutput.flush();
            fileOutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
