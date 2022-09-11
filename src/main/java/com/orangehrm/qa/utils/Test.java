package com.orangehrm.qa.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	static Logger log = Logger.getLogger(Test.class.getName());

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		
		
		log.info("Test Step 1");
		log.info("Test Step 2");
		log.info("Test Step 3");
		log.info("Test Step 4");
		log.error("Error Message");
	}
	
	
}

