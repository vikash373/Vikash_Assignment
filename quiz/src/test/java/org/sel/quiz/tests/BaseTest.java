package org.sel.quiz.tests;

import org.openqa.selenium.WebDriver;
import org.sel.quiz.utills.SystemUtills;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	public WebDriver driver;
		
			
	@Parameters("browserName")
	@BeforeClass(alwaysRun=true)
	public  void browserSetup(@Optional String browserType) {
			if(browserType!=null && !browserType.isEmpty()){
				SystemUtills sysu = new SystemUtills();
				sysu.fn_setDriverForApplication(browserType);
				driver = sysu.fn_getDriverForApplication();
				}	
	}
	
	/*
	@AfterSuite(alwaysRun=true)
	public void closeAllDriverInstance(){
		driver.quit();
	}
	*/
	
	

}
