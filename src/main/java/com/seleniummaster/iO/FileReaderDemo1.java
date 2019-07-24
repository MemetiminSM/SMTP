package com.seleniummaster.iO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) {
                   System.out.println(readToString("doc/JAVA_1525544323976.txt"));
               }

               public static String readToString(String fileToText) {
                 String workingDir = System.getProperty("user.dir");
                   StringBuilder fileContent = new StringBuilder();
                   File file = new File(workingDir + File.separator);
                   System.out.println(file);
                   try {
                           FileReader fr = new FileReader(file + File.separator + fileToText);
                           BufferedReader br = new BufferedReader(fr);
                           String sCurrentLine;
                           while ((sCurrentLine = br.readLine()) != null) {
                                   fileContent.append(sCurrentLine).append("\n");
                               }

                       } catch (IOException e) {
                           System.out.println("Cannot read the text file");
                       }
                 return fileContent.toString();
               }
}
