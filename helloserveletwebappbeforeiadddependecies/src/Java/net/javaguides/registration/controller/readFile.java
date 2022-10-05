package Java.net.javaguides.registration.controller;

import java.util.Scanner;
import java.io.File;

public class readFile {
	
	public static void readFunction ( String inputFileName ) {
		try {
			int count = 0; 
			File myObj = new File ( inputFileName ); 
			Scanner myReader = new Scanner(myObj);
			
			while ( myReader.hasNextLine()) {
				String data = myReader.nextLine();
				count++;
			}
			myReader.close();
			exportFile.exportFunction(inputFileName, count);
		}
		catch ( NullPointerException e ) {
			System.out.println("File not found here when calling readFile");
		}
		catch (Exception e ) {
			System.out.println("exception occured in readFile");
		}
	}
}
