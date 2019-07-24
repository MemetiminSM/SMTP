package com.seleniummaster.iO;

import java.util.Date;

public class FileDemo {
    public static void main(String[] args) {

        Date now=new Date();   //get current Date time

        FileUtility fileUtility = new FileUtility(); //create instance of FileUtility class
        fileUtility.writeToFile("doc", "SM",".txt",
                "Hello SM "+now.toString());

        fileUtility.writeToFile("doc", "JAVA",".txt",
                "Hello JAVA "+now.toString() +System.getProperty("user.name"));
    }
}
