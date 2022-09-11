package com.orangehrm.qa.utils;

public class StringUtil {
	
	static String xpath1 = "//tagname[contains(@class,'ABCREPLACEXYZ')]";
	
	static String xpath2 = "//tagname[contains(@class,'ABCREPLACE1XYZ') and contains(@attr,'ABCREPLACE2XYZ')]";
	
	static String dateXPath = "//li[text()='RANDOM']";
	
	public static String getNewXpath(String xpath, String replaceWith)
	{
		String newXpath = xpath.replace("RANDOM", replaceWith);
		return newXpath;
	}
	
	
	public static String getNewXpath(String xpath, String replaceWith1, String replaceWith2)
	{
		String newXpath = xpath.replace("REPLACE1", replaceWith1);
		newXpath = newXpath.replace("REPLACE2", replaceWith2);
		return newXpath;
	}

	
	
	public static void main(String[] args)
	{
		System.out.println(getNewXpath(xpath1, "10"));
		System.out.println(getNewXpath(xpath2, "20", "RANDOM"));
		System.out.println(getNewXpath(dateXPath, "May"));
		System.out.println(getNewXpath(dateXPath, "June"));
	}
}
