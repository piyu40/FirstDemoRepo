package com.practiceTest.tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.practiceTest.baseclass.TestBase;
import com.practiceTest.pageclasses.LoginPage;

public class LoginTests extends TestBase {
	
	LoginPage loginPage;
	public LoginTests() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
		
	}

	
	
	@BeforeTest
	public void setup()
	{
		initialize();
	}

	@Test
	public void loginTest() throws IOException
	{
		loginPage =new LoginPage();
		loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
