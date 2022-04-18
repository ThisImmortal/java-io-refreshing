package tutorial.io;

import java.io.File;
import java.io.IOException;

public class FileClass {

	/* How to use File class in java.io package */
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Admin\\Desktop\\fileoutput.txt");
		
		File file2 = new File("C:\\Users\\Admin\\Desktop\\fileoutput2.txt");
		
		File file3 = new File("C:\\Users\\Admin\\Desktop\\fileoutput");
		
		try {
			//Creates a new file
			file.createNewFile();
			
			//Returns name of the file
			System.out.println(file.getName());
			
			//Returns absolute path of the file
			System.out.println(file.getAbsolutePath());
			
			//Deletes the file
			file.delete();
			System.out.println(file.exists());
			
			//Renames the file
			file.renameTo(file2);
			
			//mkdir creates a new directory(folders)
			file3.mkdir();
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
