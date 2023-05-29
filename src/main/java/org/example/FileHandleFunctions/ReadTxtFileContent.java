package org.example.FileHandleFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadTxtFileContent {

    public static void main(String[] args){

        try{
            File readFile = new File("./src/main/resources/readtxtfile.txt");

            Scanner readScannerFile = new Scanner(readFile);

            while (readScannerFile.hasNextLine()){
                System.out.println(readScannerFile.nextLine());
            }

            readScannerFile.close();

        } catch (FileNotFoundException f){
            System.out.println("File Not Found Exception");
            f.printStackTrace();
        }

    }
}
