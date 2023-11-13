package com.practiceTest.pageclasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practiceTest.baseclass.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	


	@FindBy(xpath="//span[text()='Log In']")
	WebElement login1;
	

	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement loginButton;
	
	public HomePage Login(String us, String pwd)
	{
		login1.click();
		username.sendKeys(us);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
		
	}
	
	

}
