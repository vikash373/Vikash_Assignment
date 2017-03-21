package org.sel.quiz.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sel.quiz.utills.*;
import org.sel.quiz.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {
	
	public GmailSignInPage gsip = null;
	
	
	
	@BeforeClass()
	public void BeforeClassMethod() throws Exception{
		
			gsip = new GmailSignInPage(driver);
			gsip.openJoinersApplication("https://gmail.com");
		
		}
		
		
	
	//Fetch Title of Gmail Page 
	
	@Test(priority=3)
	public void verifyGmailPageTitle() throws InterruptedException{
	
		Assert.assertTrue(gsip.verifyTitle("Gmail"), "Sorry you seems on other page...!!!");
		
	}
	
	
	//Click on SignIN Button using Absolute & Relative Xpaths of SignIN Button
	@Test(priority=4)
	public void clickLogInButton() throws InterruptedException,Exception{
		try{
		gsip.setEmailId("vikash.yadav@3pillarglobal.com");
		gsip.clickNextButton();
		gsip.setPassword();
		//gsip.clickSignInButtonAbsolute();
		gsip.clickSignInButtonRelative();	
		} catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	} 
	
	
	
	@AfterClass()
	public void AfterClass(){
		driver.close();
		
	}
	
	
	

}
