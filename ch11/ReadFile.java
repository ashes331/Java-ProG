package ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	
	public static void ReadFileContents() throws IOException
	{
		FileInputStream fis_1 = new FileInputStream("file.txt");
		FileInputStream fis_2 = new FileInputStream("file.txt");
		
		try(fis_1; fis_2) {
			//.....
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) throws IOException {
		ReadFileContents();
	}
}

