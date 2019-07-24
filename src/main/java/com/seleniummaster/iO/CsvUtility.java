package com.seleniummaster.iO;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;

public class CsvUtility {

    public static void readCsv(String fileFolder, String fileName,String...headers) {

        Reader in = null;
        String currentFolder=System.getProperty("user.dir");
        String fileSeparator= File.separator;
        String csvFile=currentFolder+fileSeparator+fileFolder+fileSeparator+fileName;

        try {
            in = new FileReader(csvFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterable<CSVRecord> records = null;
        //count number of headers

        int headerCount=headers.length;

        try {
            records = CSVFormat.RFC4180.withHeader(headers).parse(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (CSVRecord record : records) {
            for (int i = 0; i < headerCount; i++) {
                String colValue = record.get(i);
                System.out.println(colValue + ", ");
            }
            System.out.println();

        }

    }
}
