package org.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteExcel {

    static void readFile() throws IOException {
        // Read file
        FileInputStream file = new FileInputStream("TestBook.xlsx");
        // Create workbook instance
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        // Get existing sheet
        XSSFSheet sourceSheet = workbook.getSheet("SourceSheet");
        XSSFSheet targetSheet = workbook.getSheet("TargetSheet");

        int rowIndex = 0;
        for (Row row : sourceSheet) {
            // Create a row in targetSheet
            XSSFRow targetRow = targetSheet.createRow(rowIndex);
            int cellIndex = 0;
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        targetRow.createCell(cellIndex).setCellValue(cell.getStringCellValue());
                        break;
                    case _NONE:
                        break;
                    case NUMERIC:
                        targetRow.createCell(cellIndex).setCellValue(cell.getNumericCellValue());
                        break;
                    case FORMULA:
                        break;
                    case BLANK:
                        break;
                    case BOOLEAN:
                        break;
                    case ERROR:
                        break;
                }
                cellIndex++;
            }
            rowIndex++;
        }

        // Output file
        FileOutputStream fileOutputStream = new FileOutputStream("TestBook.xlsx");
        // Write file
        workbook.write(fileOutputStream);
        // Close file streams
        fileOutputStream.close();
        file.close();
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}
