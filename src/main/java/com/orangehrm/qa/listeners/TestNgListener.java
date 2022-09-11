package com.orangehrm.qa.listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener{
	
	static Logger log = Logger.getLogger(TestNgListener.class.getName());

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("onTestStart: " + result.getMethod().getMethodName());
		
		log.info("Test Execution started  " + result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess : " + result.getMethod().getMethodName());
		
		log.info("Test Passed " + result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure : " +  result.getMethod().getMethodName());
		log.info("Test Failed " + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedWithTimeout");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		//System.out.println("onFinish : " +  result.getMethod().getMethodName());
	}
	
	
	

}
