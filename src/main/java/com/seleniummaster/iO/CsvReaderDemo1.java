package com.seleniummaster.iO;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;

public class CsvReaderDemo1 {
    public static void main(String[] args) {
        Reader in = null;

        String currentFolder = System.getProperty("user.dir");

        String csvFile = currentFolder + "//" + "homework.csv";


        try {
            in = new FileReader(csvFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterable<CSVRecord> records = null;
        try {
            records = CSVFormat.RFC4180.withHeader("TestID", "TestModule", "TestType").parse(in);

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (CSVRecord record : records) {
            String TestID = record.get("TestID");

            String TestModule = record.get("TestModule");
            String TestType = record.get("TestType");


            System.out.println(String.format("%s,%s,%s", TestID, TestModule, TestType));

        }

    }
}
