package tutorial.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAndWriter {

	/* Java BufferedReader class is used to read the text from a character-based input stream.
	 * It uses an internal buffer to store data. While the buffer has data, the reader will 
	 * read from it instead of directly from the underlying stream.
	 * It can be used to read data line by line by readLine() method. 
	 * It makes the performance fast. */
	
	public static void main(String[] args) {
		
		String[] names = {"Zaur", "Kyle Butler", "Dexter Morgan"};
		
		//Write to a File
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\Admin\\Desktop\\output.txt")));
			writer.write("Writing a line");
			writer.write("\nAnother line.");
			
			for(String name : names) {
				writer.write("\n" + name);
			}
			
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		//Reading from File
		try {
			/* readLine() method reads just one line and returns a String.
			 * In order to get all lines we can use a loop.
			 * */
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\output.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println("\n" + line);
			}
			reader.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		/* We can also use InputStreamReader for getting data from console*/
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(is);
			
			System.out.println("Enter data: ");
			String data = reader.readLine();
			
			System.out.println("You entered: " + data);
			reader.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	

}
