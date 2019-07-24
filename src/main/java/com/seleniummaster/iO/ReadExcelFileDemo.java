package com.seleniummaster.iO;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFileDemo {
    public static void main(String[] args) {
        //get current project path
        String projectPath = System.getProperty("user.dir");
        //get file separator
        String fileSeparator = File.separator;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File(projectPath + fileSeparator + "doc//workbook.xls"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        readContent(fileInputStream);

    }

    public static void readContent(FileInputStream excelFile) {
        //define a workbook
        HSSFWorkbook hssfWorkbook = null;
        try {
            hssfWorkbook = new HSSFWorkbook(excelFile);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        //Get first sheet from the workbook
        HSSFSheet worksSheet = hssfWorkbook.getSheetAt(0);
        //Get iterator to all the rows in the current sheet
        Iterator rowIterator = worksSheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = (Row) rowIterator.next();
            System.out.println("Row Number  " + row.getRowNum());
            //For each row, iterate through each columns
            Iterator cellIterator = row.cellIterator(); //iterate over cells
            while (cellIterator.hasNext()) {
                Cell cell = (Cell) cellIterator.next(); //read cell content
                if (cell.getCellType() != 0)
                    System.out.print(cell.getStringCellValue() + ",");
                else {
                    System.out.print(cell.getNumericCellValue() + ",");
                }
            }
            System.out.println("");
        }
        try {
            excelFile.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
