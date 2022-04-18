package tutorial.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamAndBufferedOutputStream {

	/*These classes extends FileInputStream and FileOutputStream abstract classees respectively.
	 */
	
	public static void main(String[] args) {
		
		//Write to a File
		File file = new File("C:\\Users\\Admin\\Desktop\\withBufferedOutputStream.txt");
		
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(file);
			
			BufferedOutputStream writer = new BufferedOutputStream(fileOutputStream);
			
			writer.write("New line".getBytes());
			
			writer.close();
			
			
			//Read from File
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream reader = new BufferedInputStream(fis);
			
			byte[] byteData = new byte[(int) file.length()];
			
			int readCount = 0;
			
			while((readCount = reader.read(byteData)) != -1) {
				String data = new String(byteData, 0, readCount);
				System.out.println(data);
			}
			
			reader.close();
									
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
