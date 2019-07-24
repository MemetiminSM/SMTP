package com.seleniummaster.iO;

import java.io.File;

public class ListFilesDemo {
    //list files in a directory
        public static void main(String[] args) {
                   ListFiles("doc");
               }

               public static void ListFiles(String DirectoryName) {
                   //project directory
                   String workingDirectory = System.getProperty("user.dir");
                   System.out.println("Current project directory: "+workingDirectory);
                   //define a folder
                   String dir = workingDirectory + File.separator + DirectoryName;

                   System.out.println("Final file directory : " + dir);

                   //List files in the directory
                   File file = new File(dir);

                   //define array of files 24

                   File[] files = file.listFiles();

                   if (file.exists()) {
                           System.out.println("Directory is found!");
                           for (File eachFile : files) {
                                   System.out.println(eachFile.getName()+" ; is file: "+eachFile.isFile());
                               }
                       }
                   else {
                           System.out.println("Directory is not exist");
                       }
               }
}
