package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\Vignesh\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\adactin\\configuration\\configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		
	}

	public static String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;
	}
	
	public static String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
		
	}

}
