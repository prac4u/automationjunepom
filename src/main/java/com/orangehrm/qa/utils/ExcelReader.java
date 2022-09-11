package com.orangehrm.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	XSSFWorkbook xssfworkbook;
	FileInputStream fis;
	XSSFSheet sheet;
	
	public ExcelReader(String path, String sheetname) throws IOException
	{
		
		fis = new FileInputStream(new File(path));
		xssfworkbook = new XSSFWorkbook(fis);
		sheet = xssfworkbook.getSheet(sheetname);
		
	}
	
	public int numberOfRowsInExcel()
	{
		
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int numberOfColumnsInExcel()
	{
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}
	
	
	public List<String> getDataFromRow(int rownum)
	{
		List<String> list = new ArrayList();
		
		
		Row row = sheet.getRow(rownum);
		
		for(int i=0; i<row.getLastCellNum();i++)
		{
			String data = row.getCell(i).getStringCellValue();
			list.add(data);
		}
		
		return list;
	}
	
	
	
	public Object[][] getAllData()
	{
		
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[rowCount-1][this.numberOfColumnsInExcel()];
		
		for(int i=1; i<rowCount; i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0; j<colCount;j++)
			{
				obj[i-1][j]=row.getCell(j).toString();
			}
		}
		
		return obj;
	}
	
	
	public Map<String,String> getDataViaMap(int rownum){
		Map<String,String>map=new HashMap<String,String>();
		
		Row values = sheet.getRow(rownum);
		Row keys   = sheet.getRow(0);
		
		for(int i=0; i<values.getLastCellNum();i++)
		{
			
		
			
			String key = keys.getCell(i).getStringCellValue();
			String value = values.getCell(i).getStringCellValue();
			map.put(key, value);
		}
		
		return map;
	}
	
	public Map<Integer, Map<String,String>> getDataViaMap(){
		
		Map<Integer, Map<String,String>> allData = new HashMap<Integer, Map<String,String>>();
		Map<String,String>map;
		
		
		Row keys   = sheet.getRow(0);
		
		
		for(int j=1; j<=sheet.getLastRowNum();j++)
		{
		
			Row values = sheet.getRow(j);
			map=new HashMap<String,String>();
			for(int i=0; i<values.getLastCellNum();i++)
			{
			String key = keys.getCell(i).getStringCellValue();
			String value = values.getCell(i).getStringCellValue();
			map.put(key, value);
			}
			
		allData.put(j, map);
		}
		return allData;
	}
	
	
	public void cellTypeData(int rownum)
	{
		Row row = sheet.getRow(rownum);
		
		for(int i=0; i<row.getLastCellNum();i++)
		{
			
			System.out.println(row.getCell(i).getCellType());
			//String data = row.getCell(i).getStringCellValue();
			
		}
		
	}
	
	
	
	


}
