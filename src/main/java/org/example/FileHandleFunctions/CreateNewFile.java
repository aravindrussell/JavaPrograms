package org.example.FileHandleFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CreateNewFile {

    public static void main(String[] args) {

        try {
            File newFile = new File("./src/main/resources/newtextfile.txt");

            if(newFile.createNewFile()){
                System.out.println("The File " + newFile.getName() + " has been created Successfully");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Error");
            e.printStackTrace();
        } catch (IOException i){
            System.out.println("IOException occures");
            i.printStackTrace();
        }
    }
}
