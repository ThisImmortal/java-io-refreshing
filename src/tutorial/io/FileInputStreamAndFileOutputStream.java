package tutorial.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamAndFileOutputStream {


	/* The byte stream in java allows us to transmit 8 bits of data.
	 * Byte stream is defined by two abstract classes: InputStream and OutputStream. 
	 * The InputStream class used for byte stream based input operations and 
	 * the OutputStream class used for byte stream based output operations.
	 * The InputStream and OutputStream classes have several concreate classes to perform various IO operations 
	 * based on the byte stream.
	 * FileInputStream and FileOutputStream one of such subclasses.
	 * These classes byte stream alternatives of FileReader and FileWriter classes (character base stream) 
	 * Because of they don't use buffer their performance is low.
	 * Let's  write some examples. */ 
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Admin\\Desktop\\withFileInputOutputStream.txt");
		
		try {
			
			//Write to a File with FileOutputStream
			FileOutputStream writer = new FileOutputStream(file);
			
			String text = "Write with FileOutputStream";
			
			byte[] textWithByte = text.getBytes();
			
			writer.write(textWithByte);
			
			
			writer.close();
			
			
			//Read from File with FileInputStream
			FileInputStream reader = new FileInputStream(file);
			
			byte[] byteData = new byte[(int) file.length()];
			
			reader.read(byteData);
			
			String data = new String(byteData);
			
			System.out.println(data);
			
			reader.close();
			
					
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
