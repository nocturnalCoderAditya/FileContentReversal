package main.java.com.techsavvy.ReverseFileApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import main.java.com.techsavvy.Exception.EmptyFileException;

public class ReverseFile {
	private static final String OUTPUT = "src/main/resources/output.txt";

	public String readFileContent(File file) throws IOException{
		FileInputStream inputStream = null;
		StringBuffer sb = new StringBuffer();
		int byteArr[] = null;
		try {
			inputStream = new FileInputStream(file);
			int currentByteCount = inputStream.available();
			if(currentByteCount == 0) {
				throw new EmptyFileException("No Content in the file");
			}
			int count = 0;
			byteArr = new int[currentByteCount];
			while(count < currentByteCount){
				byteArr[count] = inputStream.read();
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
		}
		for(int i=0; i< byteArr.length; i++){
			sb.append((char) byteArr[i]);
		}
		return sb.toString();
	}

	public String reverseFileContent (String input){
		StringBuffer buffer = new StringBuffer(input);
		return buffer.reverse().toString();
	}

	public void writeOutputToFile(String input) {
		String output = reverseFileContent(input);
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(OUTPUT);
			writer.println(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			writer.close();
		}
	}

}
