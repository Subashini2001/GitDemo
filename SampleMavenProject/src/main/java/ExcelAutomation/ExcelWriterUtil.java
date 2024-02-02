package ExcelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileOutputStream;
import java.io.IOException;
 
public class ExcelWriterUtil {
 
    public static void writeDataToExcel(String filePath, String sheetName, Object[][] data) {
        try (Workbook workbook = new XSSFWorkbook()) {
            // Create a sheet in the workbook
            Sheet sheet = workbook.createSheet(sheetName);
 
            // Write data to the sheet
            for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
                Row row = sheet.createRow(rowIndex);
 
                for (int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
                    Cell cell = row.createCell(colIndex);
 
                    if (data[rowIndex][colIndex] instanceof String) {
                        cell.setCellValue((String) data[rowIndex][colIndex]);
                    } else if (data[rowIndex][colIndex] instanceof Integer) {
                        cell.setCellValue((Integer) data[rowIndex][colIndex]);
                    }
                    // Add more conditions for other data types if needed
                }
            }
 
            // Save the workbook to the specified file path
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        // Example usage
        String filePath = "C:\\Amydocument\\SDET\\Testdata\\LoginData.xlsx";
        String sheetName = "LoginDataNew";
 
        Object[][] testData = {
                {"Name", "Age"},
                {"Suba", 22},
                {"Abi", 20},
                // Add more data as needed
        };
 
        writeDataToExcel(filePath, sheetName, testData);
    }
}