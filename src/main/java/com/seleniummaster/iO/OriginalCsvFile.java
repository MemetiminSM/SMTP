package com.seleniummaster.iO;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class OriginalCsvFile {
    public static void main(String[] args) throws IOException {

        CSVWriter csvWriter = new CSVWriter(new FileWriter("homework.csv"));
        csvWriter.writeNext(new String[]{"TestID", "TestModule", "TestType"});
        csvWriter.writeNext(new String[]{"1", "Login", "Regression"});
        csvWriter.writeNext(new String[]{"2", "Logout", "Regression"});
        csvWriter.writeNext(new String[]{"3", "Change User Settings", "Regression"});
        csvWriter.close();
    }
}
