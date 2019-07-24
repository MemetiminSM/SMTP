package com.seleniummaster.iO;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;

public class CsvReadDemo {
    public static void main(String[] args) {
        Reader in = null;

        String currentFolder=System.getProperty("user.dir");
        String fileSeparator= File.separator;
        String csvFile=currentFolder+fileSeparator+"doc"+fileSeparator+"login.csv";


        try {
            in = new FileReader(csvFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterable<CSVRecord> records = null;
        try {
            records = CSVFormat.RFC4180.withHeader("username", "password","role").parse(in);

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (CSVRecord record : records) {
            String loginName = record.get("username");

            String loginpassword= record.get("password");
            String role= record.get("role");

            System.out.println(String.format("%s,%s,%s",loginName,loginpassword,role));

        }

    }
}
