package org.example.FileHandleFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTxtFileContent {

    public static void main (String args[]){
        try {
            String f = "./src/main/resources/readtxtfile.txt";
            File writeFile = new File(f);
            FileWriter fileWriter = new FileWriter(writeFile);
            fileWriter.write("Adding New Line *********************** ");
            fileWriter.close();

            Scanner readScannerFile = new Scanner(writeFile);
            while (readScannerFile.hasNextLine()){
                System.out.println(readScannerFile.nextLine());
            }
            readScannerFile.close();
        } catch (FileNotFoundException f){
            System.out.println("File not fount error");
            f.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException occurs");
            e.printStackTrace();
        }
    }
}
