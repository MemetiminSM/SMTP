package com.seleniummaster.iO;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteExcelFileDemo {
    public static void main(String[] args) {
        //get current project path
        String projectPath = System.getProperty("user.dir");
        //get file separator
        String fileSeparator = File.separator;
        //define List and add content for the Excel File
        List<String> excelContent = new ArrayList<String>();
        excelContent.add("TestId,TestName,TestModule,TestType,TestSteps,Action,TestResult,Note");
        excelContent.add("1,Login,Dashboard,Regression,1,Open Browser,Browser Should Open,This is a note");
        excelContent.add("2,Add New Client,Dashboard,Regression,1,Add New Client,New Client Is Added,This is a note for Client");
        excelContent.add("3,Logout,Main Page,Regression,1,User logout,User logged out,This is a note for logout");
        writeContent(projectPath + fileSeparator + "doc/TestResult.xls", "TestCases", excelContent);
        writeContent(projectPath + fileSeparator + "doc/TestResult2.xls", "TestCases", excelContent);
    }

    public static void writeContent(String fileName, String sheetName, List<String> content) {
        try {
            //define a workbook
            Workbook wb = new HSSFWorkbook();
            //define output file
            FileOutputStream fileOut = new FileOutputStream(fileName);
            //add a sheet to the workbook
            Sheet sheet = wb.createSheet(sheetName);
            int numberOfRows = content.size(); //return number of items in the list object
            for (int i = 0; i <= numberOfRows - 1; i++) {
                //define rows based on the number of items in the list
                Row row = sheet.createRow(i);
                //Read each line in the list and split the content to String array using comma
                String[] rowContent = content.get(i).split(",");
                //get array size
                int totalCells = rowContent.length;
                //define cells for each row
                for (int j = 0; j <= totalCells - 1; j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(rowContent[j]);
                }
            }
            wb.write(fileOut);
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}
