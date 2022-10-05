package Java.net.javaguides.registration.controller;

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileWriter;

public class exportFile {

	public static void exportFunction () throws FileNotFoundException, IOException {
	
		// Creating a workbook instances
		Workbook wb = new HSSFWorkbook();

		// Creating output file
		OutputStream os = new FileOutputStream("Please.xls");

		// Creating a sheet using predefined class
		// provided by Apache POI
		Sheet sheet = wb.createSheet("Company");

		// Creating a row at specific position
		// using predefined class provided by Apache POI

		// Specific row number
		Row row = sheet.createRow(2);

		// Specific cell number
		Cell cell = row.createCell(2);

		// putting value at specific position
		cell.setCellValue("working please please");

		// Finding index value of row and column of give
		// cell
		int rowIndex = cell.getRowIndex();
		int columnIndex = cell.getColumnIndex();

		// Writing the content to Workbook
		wb.write(os);

		// Printing the row and column index of cell created
		System.out.println("Given cell is created at i changed something " + "(" + rowIndex + "," + columnIndex + ")");
		wb.close();

	}
}
