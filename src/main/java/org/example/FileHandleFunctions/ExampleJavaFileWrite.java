package org.example.FileHandleFunctions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class ExampleJavaFileWrite {

    public static void main(String[] args) {
        File file = null;
        FileWriter filewriter = null;
        String data = "TechBlogStationNewFileWriter";
        try {
            file = new File("./src/main/resources/readtxtfile.txt");
            filewriter = new FileWriter(file);
            filewriter.write(data);
            filewriter.close();
            System.out.println("File writing done.");
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (filewriter != null) {
                    filewriter.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
