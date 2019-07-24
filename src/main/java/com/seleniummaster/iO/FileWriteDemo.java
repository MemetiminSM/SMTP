package com.seleniummaster.iO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args)
    {
        String fileFormat=".txt";
        String fileName="testfile2_" +System.currentTimeMillis()+fileFormat; //add time stamp to the file name

        File file=new File(fileName);
        FileWriter fw= null;
        try {
            fw = new FileWriter(file.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw=new BufferedWriter(fw); //create a buffer writer instance
        //Prepare file content
        StringBuilder myString=new StringBuilder();
        myString.append("This is line 1 ").append("\n");  // \n is for changing a line
        myString.append("This is line 2\n");
        myString.append("This is line 3\n");
        try {
            bw.write(myString.toString()); //write the content to the file in the buffer
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.close(); //close the file after writing the content
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
