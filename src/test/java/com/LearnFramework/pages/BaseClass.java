package com.LearnFramework.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import utility.BrowserFactory;
import utility.ConfigDataProvider;
import utility.ExcelDataReader;
import utility.helper;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataReader excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void SetUp() {
		excel = new ExcelDataReader();
		config = new ConfigDataProvider(); }
	
	@BeforeClass
	public void BrowserTest() {
		driver = BrowserFactory.browserOptions(driver,config.getBrowser(),config.getAppUrl());
	}
	
	@AfterClass
	public void teardown() {
		BrowserFactory.closeBrowser(driver);
		
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			helper.capturedScreenShot(driver, "1.passed");
		}
	}







}




