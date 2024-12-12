package com.ReadcsvFile;

import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class ReadCsv {

	public static void main(String[] args) throws IOException {
		
		 String filePath = "C:\\Users\\Sai Prasanth\\git\\TestCoreJavaDemo\\CoreJavaDemo\\src\\main\\resources\\csvFiles\\test.csv";
	        
	        // Open the file and parse it
	        FileReader reader = new FileReader(filePath);
	        
	        // Parse the CSV file with header
	        Iterable<CSVRecord> records = CSVFormat.DEFAULT
	            .withHeader()  // Indicates the first row contains headers
	            .parse(reader);
	        
	        // Iterate over each row in the CSV file
	        for (CSVRecord record : records) {
	            // Access a specific value based on the header name
				//String value = record.get("Username");  // Replace 'your_header' with the actual header name

	            String value = record.get("Username");  // Replace 'your_header' with the actual header name
	            System.out.println(value);  // Print the value for this header
	        }
	        
	        reader.close();  // Don't forget to close the file
	    }

	}


