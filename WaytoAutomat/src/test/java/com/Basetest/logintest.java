package com.Basetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.genericlibrary.BrowserFactoryy;
import Com.genericlibrary.Constantss;
import Com.genericlibrary.Screenshot;
import Com.genericlibrary.commanwaitlibrary;
import Com.genericlibrary.screenshotROBOTclass;
import ObjRepo.Baseclass.Login;
import ObjRepo.Home.Loginpage;



@Listeners(Com.genericlibrary.ITestlistner.class)


public class logintest {
	WebDriver driver;
	public Login logn;

	@BeforeMethod
	public void beformethod() {
	    driver = BrowserFactoryy.getbrowser();
		driver.manage().window().maximize();
		driver.get(Constantss.url);
	}

	@AfterMethod
	public void aftermethod(ITestResult Result) throws Exception  {
		//driver.close();
		if(ITestResult.FAILURE==Result.getStatus())
		{
			Screenshot.capturescreenshot(driver, Result.getName());
		      //screenshotROBOTclass.screenshotbyRobot(driver, Result.getName());
		}
		
	}
	@Test
	public void loginmethod() throws Exception {
		//commanwaitlibrary.waitForElementToBeClickable(null);
		/*String userid = Constantss.username;
		String pwd = Constantss.password;

		commanwaitlibrary.waitForpageLoad(driver);
		logn = new Login(driver);
		logn.loginmethod(userid, pwd);*/
		
		
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(4000);
		lp.logintest("AshishVishnoi", "ashish");
		
	}
	
	@AfterMethod
	public void aftermethod(){
		driver.close();
		System.out.println("Login is successfully");
	}
	
}
