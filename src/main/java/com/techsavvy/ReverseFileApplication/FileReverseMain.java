package main.java.com.techsavvy.ReverseFileApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import main.java.com.techsavvy.Exception.EmptyFileException;

public class FileReverseMain {
	private static final String INPUT = "src/main/resources/input.txt";

	public static void main(String[] args) throws IOException {
		File fileToRead = new File(INPUT);
		ReverseFile fileReverse = new ReverseFile ();
		String inputStr = fileReverse.readFileContent(fileToRead);
		fileReverse.writeOutputToFile(inputStr);
	}
}
