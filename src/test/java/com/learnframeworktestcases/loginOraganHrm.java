package com.learnframeworktestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LearnFramework.pages.BaseClass;
import com.LearnFramework.pages.LoginPage;
import utility.ExcelDataReader;


public class loginOraganHrm extends BaseClass {
	
	@Test
	public void loginApp() {
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("Sheet1", 0, 0);
		LoginPage loginTest = PageFactory.initElements(driver, LoginPage.class);
		loginTest.TestLoginPage(excel.getStringData("Sheet1", 0, 0),excel.getStringData("Sheet1", 0, 1));
	}
}


