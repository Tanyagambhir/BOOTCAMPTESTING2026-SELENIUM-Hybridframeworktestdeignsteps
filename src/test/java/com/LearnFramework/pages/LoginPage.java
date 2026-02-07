package com.LearnFramework.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage {
	
	

	public class LoginEasyCal {
		WebDriver driver;
		
		public LoginEasyCal(WebDriver driver) {
			this.driver=driver;
			
		}
		@FindBy(id="log_email")
		WebElement email;
		
		@FindBy(id="log_password")
		WebElement password;
		
		@FindBy(xpath="//input[@name='log_submit']")
		WebElement loginbtn;
		
		public void login_easyCal(String uname, String pass) {
			email.sendKeys(uname);
			password.sendKeys(pass);
			loginbtn.click();
		}

	}

	public void LoginHRM(String stringData, String stringData2) {
		
		
	}

	public void LOGINHRM(String stringData, String stringData2) {
		// TODO Auto-generated method stub
		
	}


}
