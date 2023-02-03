package com.epsi.mickael.demo5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo05 {

    public static void main(String[] args) {
        Demo05 demo = new Demo05();
        demo.run();

    }

    private void run() {

        // Create and write
         FileWriter myWriter = null;
        try {
            File myFile = new File("./test.txt");
            if (!myFile.exists()) {
                myFile.createNewFile();
            }

            myWriter = new FileWriter(myFile);
            myWriter.write("Hello from code to file !");
            myWriter.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (myWriter != null) {
                try {
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Read file.
        Scanner myReader = null;
        try {
            File myFile = new File("./test.txt");
            myReader = new Scanner(myFile);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (myReader != null) {
                myReader.close();
            }
        }



    }

}
