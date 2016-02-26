package ca.bccampus.esb.dtos.validation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ValidatationTest {
	
	public static void main(String[] args) {
		System.out.println ("Validating target(" + args[1] + ") using schema(" + args[0] + ")");
		try {
			// create a new validator
			BatchValidator validator = new BatchValidator();
			
			// set its schema
			validator.setBatchSchemaLocation(args[0]);
			
			// read the the file
		    StringBuffer fileData = new StringBuffer(1000);
		    BufferedReader reader = new BufferedReader(new FileReader(args[1]));
		    char[] buf = new char[1024];
		    int numRead=0;
		    while ((numRead=reader.read(buf)) != -1) {
		      fileData.append(buf, 0, numRead);
		    }
		    reader.close();

		    // at last perform validation:
		    validator.validate(fileData.toString());
		    System.out.println ("Validated OK.");
		}
		catch (FileNotFoundException e) {
			System.out.println("Cannot find input file(" + args[0] + ") " + e.getMessage() + " " + e.getCause());
		}
		catch (IOException ie) {
			System.out.println("Error: " + ie.getMessage());
		}
		catch (Exception ee) {
			System.out.println("Fatal Error: " + ee.getMessage() + " " + ((ee.getCause() != null) ? ee.getCause().getMessage() : ""));
		}
	}
}
