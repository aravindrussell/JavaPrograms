package org.example.FileHandleFunctions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class ExampleJavaFileWriteOuputStream {

    public static void main(String args[]) {
        File file = null;
        FileOutputStream fileOutStream = null;
        String data = "TechBlogStation";
        try {
            file = new File("./src/main/resources/readtxtfile.txt");
            fileOutStream = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] b = data.getBytes();
            fileOutStream.write(b);
            fileOutStream.flush();
            fileOutStream.close();
            System.out.println("File writing done.");
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutStream != null) {
                    fileOutStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
