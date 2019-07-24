package com.seleniummaster.iO;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args)
       {
                   DeleteAFile("docs.Selenium.2018_05_08_01_50_17.txt");
               }

               //Delete a file
               public static void DeleteAFile(String filename) {
                   //get current project path
                   String filePath = System.getProperty("user.dir");
                   //create a new file object instance
                   String folderSeparator= File.separator;
                   File file = new File(filePath + folderSeparator + filename);
                   if (!file.exists()) {
                           System.out.println("File is not found");
                       } else {
                           //delete a file
                           System.out.println("File already exist, deleting the file...");
                           file.delete();

                       }
               }
}
