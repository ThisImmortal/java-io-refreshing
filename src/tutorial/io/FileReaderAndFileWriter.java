package tutorial.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWriter {

	/* For input and output processes Java has package named java.io. 
	 * Java uses streams for file reading(input) and writing(output). We can imagine stream as an eternal flow or
	 * smth like a pipe flow (actually, this is my personal imagination :)) between file and our program.
	 * There are 2 types of streams in Java:
	 * 1) Byte Stream
	 * 2) Character Stream
	 * 
	 * The character stream in java allows us to transmit 16 bits of data.
	 * Character stream is defined by two abstract classes: Writer and Reader. 
	 * The Reader class used for character stream based input operations and 
	 * the Writer class used for charater stream based output operations.
	 * The Reader and Writer classes have several concreate classes to perform various IO operations 
	 * based on the character stream.
	 * FileReader and FileWriter one of such subclasses. 
	 * Because of they don't use buffer their performance is low.
	 * Let's  write some examples. */
	
	public static void main(String[] args) {
		
		try {
			
			//Write to a file using FileWriter
			
			File file = new File("C:\\Users\\Admin\\Desktop\\withFileWriter.txt");
			FileWriter writer = new FileWriter(file);			
			writer.write("New line");
			writer.write("\nAnother line");
			writer.close();
			
			
			//Read from file using FileReader
			
			char[] data = new char[(int) file.length()];
			FileReader reader = new FileReader(file);
			reader.read(data);
			String fileData = new String(data);
			System.out.println(fileData);
			reader.close();
						
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
