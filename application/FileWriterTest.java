package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good mornig", "Good afternoon", "Good night"};
		
		String path = "/home/lucas/Documentos/out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
