package Java.net.javaguides.registration.controller;
import java.io.FileWriter;

public class writeFile {
	
	public static void writeFunction (String username, String password ) 
	{
	try {
		FileWriter myWriter = new FileWriter("fileNameNew.txt", true);
		myWriter.write(username + "\n");
		myWriter.write(password + "\n");
		myWriter.close();
	}
	catch ( Exception E )
	{
		System.out.println("There is something wrong with the write in file ");
	}
}
}
