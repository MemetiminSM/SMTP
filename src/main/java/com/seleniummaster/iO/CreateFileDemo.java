package com.seleniummaster.iO;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CreateFileDemo {
    public static void main(String[] args) {
        createAFile("doc", "Selenium", ".txt");
    }

    //Create a new file with time stamp\
    public static void createAFile(String folder, String fileName, String fileExtention) {
        //get current project path
        String filePath = System.getProperty("user.dir");
        //get current date time stamp
        Date currentDate = new Date();
        String pattern = "yyyy-MM-dd-hh-mm-ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String timeStamp = format.format(currentDate).replace("-", "_");
        //create a new file object instance
        File file = new File(filePath +"/"+ folder + "." + fileName + "." + timeStamp + fileExtention);
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File is created");
                System.out.println("File name : " + file);
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
