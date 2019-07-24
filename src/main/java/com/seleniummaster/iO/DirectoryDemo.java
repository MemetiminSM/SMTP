package com.seleniummaster.iO;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args)
       {
                   createADirectory("doc","testdir1000000");
               }

               //define a static method to create a folder
               public static void createADirectory(String parentFolder,String directoryName)
       {
                   //project directory
                   String workingDirectory = System.getProperty("user.dir");
                   //define a folder path
                   // workingDirectory+"\\"+parentFolder+"\\"+directoryName
                   String  dir = workingDirectory + File.separator + parentFolder+ File.separator+directoryName;
                   System.out.println("Final file directory : " + dir);

                   //create a directory in the path
                   File file = new File(dir);

                   if (!file.exists()) {
                       boolean isFolderCreated= file.mkdir();
                           System.out.println("Directory is created? "+isFolderCreated);
                       } else {
                           System.out.println("Directory is already existed!");
                       }

               }

}
