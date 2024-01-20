package test.java.com.techsavvy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

import main.java.com.techsavvy.ReverseFileApplication.ReverseFile;

class ReverseFileTest {
	

    @Test
    void testReverseFileContent() {
        ReverseFile reverseFile = new ReverseFile();
        String inputFileContent = "ABC";
        String expectedOutput = "CBA";
        String result = reverseFile.reverseFileContent(inputFileContent);
        assertEquals(expectedOutput, result);
    }
    
    @Test
    void testWriteOutputToFile() {
    	ReverseFile reverseFile = new ReverseFile();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        String output = reverseFile.reverseFileContent("ABC");
        printWriter.println(output);
        String result = stringWriter.toString().strip();
        assertEquals("CBA", result);
    }

   
}
