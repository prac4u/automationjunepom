package com.orangehrm.qa.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropConfig {
	
	public static Properties prop;
	public static String STFilePath="\\src\\main\\resources\\appconfiguration-ST.properties";
	public static String UATFilePath="\\src\\main\\resources\\appconfiguration-UAT.properties";
	
	
	public static  Properties loadProperties(String env) throws IOException
	{
		String filePath="";
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		if(env.equals("ST"))
		{
		
		 filePath = path + STFilePath;
		 System.out.println(filePath);
		}
		else if(env.equals("UAT"))
		{
			 filePath = path + UATFilePath;
				System.out.println(filePath);
		}
		
		FileReader file = new FileReader(new File(filePath));
		
		prop = new Properties();
		prop.load(file);
		
		return prop;
				
		}
		
	
}