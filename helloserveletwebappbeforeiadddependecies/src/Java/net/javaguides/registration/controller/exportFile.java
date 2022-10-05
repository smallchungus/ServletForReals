package Java.net.javaguides.registration.controller;
import java.util.Scanner;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exportFile {
	
	public static void exportFunction (String inputFileName, int size) {
		
//		try {
//			Workbook workbook = new Workbook ("C:\\Users\\wchen\\eclipse\\jee-2022-06\\eclipse\\excelOutput.xlsx");
//			Worksheet worksheet = workbook.getWorksheets().get(0);
//			
//			int [][] array2D = new int[size/2][2];
//			int count = 0; 
//			
//			File myObj = new File ( inputFileName );
//			java.util.Scanner myReader = new Scanner ( myObj );
//			System.out.println("the export file works up to this point I guess");
//			
//			for ( int i =0; i < size/2; i ++ ) 
//			{
//				for ( int j= 0; j < 2; j ++ ) 
//				{
//					String data = myReader.nextLine();
//					
//					if ( count % 2 == 0 ) 
//					{
//						array2D[i][j] = count; 
//						System.out.println(array2D[i][j]);
//					}
//					else 
//					{
//						array2D[i][j] = count; 
//						System.out.println(array2D[i][j]);
//					}
//					count++;
//				}
//			}
//			myReader.close();
//			workbook.save("C:\\Files\\output.xlsx");
	      // Creating Workbook instances
        Workbook wb = new HSSFWorkbook();
  
        // An output stream accepts output bytes and
        // sends them to sink
        OutputStream fileOut;
			fileOut = new FileOutputStream("Geeks.xlsx");
	
  
        // Now creating Sheets using sheet object
        Sheet sheet1 = wb.createSheet("Array");
        Sheet sheet2 = wb.createSheet("String");
        Sheet sheet3 = wb.createSheet("LinkedList");
        Sheet sheet4 = wb.createSheet("Tree");
        Sheet sheet5 = wb.createSheet("Dynamic Programing");
        Sheet sheet6 = wb.createSheet("Puzzles");
  
        // Display message on console for successful
        // execution of program
        System.out.println(
            "Sheets Has been Created successfully");
  
        // Finding number of Sheets present in Workbook
        int numberOfSheets = wb.getNumberOfSheets();
        System.out.println("Total Number of Sheets: "
                           + numberOfSheets);
  
        wb.write(fileOut);
		}
	}

