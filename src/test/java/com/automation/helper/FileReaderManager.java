package com.automation.helper;

public class FileReaderManager {
	
	public static FileReaderManager getInstance() {
	
		FileReaderManager filereader = new FileReaderManager();
		return filereader;
		
	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}
	
}
