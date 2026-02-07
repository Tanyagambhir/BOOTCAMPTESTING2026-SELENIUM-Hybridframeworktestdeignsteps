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
		excel.getStringData("LoginHRM", 0, 0);
		LoginPage loginHRM =PageFactory.initElements(driver,LoginPage.class);
		loginHRM.LOGINHRM(excel.getStringData("LoginHRM", 0, 0),excel.getStringData("LoginHRM", 0, 1));
	}
}


