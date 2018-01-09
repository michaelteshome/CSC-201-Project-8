import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class TextFileIO {
	
	public void createFile(String in) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(in);
			
		}
		
		catch(Exception e) {
			System.out.println("File could not be created");
		}
		
	}
	
	
	public void readFile(String in) {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(in));
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
		
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println(line);
		}
		inputStream.close();
	}
	
	
	
	
	
	
}
