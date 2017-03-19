package org.sel.quiz.tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sel.quiz.pages.WebJoinerPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WebJoinerTest extends BaseTest{
	
	public WebJoinerPage wjp = null;
	
	

	@BeforeClass()
	public void beforeclassMethod() throws Exception{
	try{
		wjp = new WebJoinerPage(driver);
		wjp.openJoinersApplication("https://staging.contactmanager.biz/ASGBI_Test/member-area/Web-Joiner/");
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}
	
	}
	
	
	@Test(description="This test case is to verify title oj joiner home page", priority=3)
	public void verifyHomeScreenOfJoinerApp() throws  Exception{
	
	Assert.assertTrue(wjp.verifyHomePage("Web Joiner"),"Joiner page not found ");
	
	}
	
	
	@Test(description="This test case is used to create membership subscription from joiner portal", priority=4)
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
		wjp.setEmailId("vikash@3p.com");
		wjp.setConfirmEmailId("vikash@3p.com");
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
			throw new Exception(e.getMessage());
		}
	}
				
		
	@AfterClass()
	public void verifyConfirmationScreen()
	{
		//driver.close();
		
	}
	
	
	
}
