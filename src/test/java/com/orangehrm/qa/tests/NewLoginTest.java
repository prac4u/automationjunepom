package com.orangehrm.qa.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.qa.utils.ExcelReader;

public class NewLoginTest {

	
	
	@Test
	public void login() throws IOException
	{
		String userDir = System.getProperty("user.dir");
		String path = userDir+"\\src\\test\\resources\\usercredentials.xlsx";
		System.out.println(path);
		String sheetName = "credentials";
		
		ExcelReader excelReader = new ExcelReader(path, sheetName);
		
		System.out.println(excelReader.numberOfRowsInExcel());
		System.out.println(excelReader.numberOfColumnsInExcel());
		System.out.println(excelReader.getDataFromRow(2));
	}
	
	
	@DataProvider
	public Object[][] data() throws IOException
	{
		String userDir = System.getProperty("user.dir");
		String path = userDir+"\\src\\test\\resources\\usercredentials.xlsx";
		System.out.println(path);
		String sheetName = "credentials";
		ExcelReader excelReader = new ExcelReader(path, sheetName);
		return excelReader.getAllData();
		
	}
	
	
	@Test(dataProvider = "data")
	public void test2(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test
	public void test3() throws IOException
	{
		String userDir = System.getProperty("user.dir");
		String path = userDir+"\\src\\test\\resources\\usercredentials.xlsx";
		System.out.println(path);
		String sheetName = "credentials";
		ExcelReader excelReader = new ExcelReader(path, sheetName);
		
		System.out.println(excelReader.getDataViaMap(3));
		System.out.println(excelReader.getDataViaMap());
	}

	@DataProvider
	public Object[][] data1() throws IOException
	{
		String userDir = System.getProperty("user.dir");
		String path = userDir+"\\src\\test\\resources\\usercredentials.xlsx";
		System.out.println(path);
		String sheetName = "data";
		
		ExcelReader excelReader = new ExcelReader(path, sheetName);
		return excelReader.getAllData();
		
	}
	
	
	@Test(dataProvider = "data1")
	public void test3(String a, String b, String c, String d)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
