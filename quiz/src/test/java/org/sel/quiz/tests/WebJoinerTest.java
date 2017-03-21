package org.sel.quiz.tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sel.quiz.OR.WebJoinerPageOR;
import org.sel.quiz.pages.WebJoinerPage;
import org.sel.quiz.utills.SystemUtills;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WebJoinerTest extends BaseTest{
	
	public WebJoinerPageOR wjpOR = null;
	public WebJoinerPage wjp = null;
	
	

	@BeforeClass()
	public void beforeclassMethod() throws InterruptedException {
		wjpOR = new WebJoinerPageOR(driver);
		wjp = new WebJoinerPage(wjpOR.driver);
		wjp.openJoinersApplication("https://staging.contactmanager.biz/ASGBI_Test/member-area/Web-Joiner/");
	}
	
	
	@Test(description="This test case is to verify title oj joiner home page", priority=1)
	public void verifyHomeScreenOfJoinerApp() throws  InterruptedException{
	
		Assert.assertTrue(wjp.verifyHomePage("Web Joiner"),"Joiner page not found ");
	
	}
	
	
	@Test(description="This test case is used to create membership subscription from joiner portal", priority=2)
	public void registerforPaidMembeship() throws  Exception{
		try{	
		
		wjp.clickonTermAndConditionLink();
		wjp.selectMembershipProduct();
		wjp.setTitle();
		wjp.setForename("Test");
		String timeStamp = new SimpleDateFormat("HHmmss").format(new Date(System.currentTimeMillis()));
		System.out.println(timeStamp);
		wjp.setSurname("surname".concat(timeStamp));
		wjp.selectGenderValue("Male");
		wjp.setMobileNumber("1234567");
		wjp.setWorkpostcode("EX8 2AB");
		wjp.selectHospAddressFromPostCode();
		String emailID = "vikash"+timeStamp+"@3p.com";
		System.out.println(emailID);
		wjp.setEmailId(emailID);
		wjp.setConfirmEmailId(emailID);
		wjp.setHospitalName("HSP Name");
		wjp.setHospitalPostCode("CM1 2RR");
		wjp.selectHomeAddressFromPostCode();
		wjp.setPrimaryInterest();
		wjp.setPassword("123456");
		wjp.setConfirmPassword("123456");
		wjp.clickNextButton();
		wjp.selectDonationAmt();
		wjp.clickNextButton();
		//wjp.addPaymentdetails("5404000000000001", "12", "21", "123");
		
		//Assert.assertTrue(wjp.verifyConfirmationText(), "Something went wrong confirmation screen not shown");
		
	}catch(Exception e){
		    System.out.println("Exception Occured");
			SystemUtills.fn_captureScreenshot(driver, "PaidMembership");
		}
	}
				
		
	@AfterClass()
	public void verifyConfirmationScreen()
	{
		driver.close();
		
	}
	
	
	
}
