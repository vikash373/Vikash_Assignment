package org.sel.quiz.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sel.quiz.utills.SystemUtills;

import com.google.common.base.Function;


public class WebJoinerPage  {
	
	public WebDriver driver;
	
	/* Web Elements */
	
	@FindBy(xpath=".//*[@id='productList']/tbody/tr[1]/td/input[2]")
	WebElement productListOption;

	@FindBy(id="NextButton")
	WebElement nextButton;
	
	@FindBy(xpath=".//*[@id='EntityFormView']/div[2]/div[1]/div/fieldset[1]/table/tbody/tr[1]/td[1]/div[2]/div[1]/div/button[2]")
	WebElement titleLookupButton;
	
	@FindBy(xpath=".//*[@id='EntityFormView']/div[2]/div[2]/div/fieldset/table/tbody/tr[12]/td[1]/div[2]/div[1]/div/button[2]")
	WebElement pinterestLookupButton;
	
	@FindBy(className="modal-content")
	WebElement modalDialog1;
	
	@FindBy(xpath=".//button[text()='Select']")
	WebElement modalSaveButton;
	
	@FindBy(id="de_surname")
	WebElement surnameEditbox;
	
	@FindBy(id="de_forename")
	WebElement forenameEditbox;
	
	@FindBy(xpath="//td[text()='Dr']")
	WebElement titleText;
	
	//*[@id='de_subclassification1_ref_lookupmodal']/div/section/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]
	
	@FindBy(xpath="//td[contains(text(),'E.N.T.')]")
	WebElement pInterestText;
	
	@FindBy(xpath=".//*[@id='de_subclassification1_ref_lookupmodal']/div/section/div/div/div[3]/button[1]")
	 WebElement modalSaveButton2;
	
	@FindBy(id="de_contactgender")
	 WebElement genderOptions;
	
	@FindBy(id="de_honours")
	 WebElement qualificationEditbox;
	
	@FindBy(id="de_mobile")
	 WebElement mobileEditbox;
	
	@FindBy(id="de_postcode")
	 WebElement workpostcodeEditbox;
	
	@FindBy(id="btnHospitalAddr_Postcode")
	 WebElement workPostcodeButton;
		
	@FindBy(id="de_completeaddress")
	 WebElement workaddressTextArea;
	
	@FindBy(id="de_town")
	 WebElement workTownEditBox;
	
	@FindBy(id="de_county")
	 WebElement workCountyEditBox;
	
	@FindBy(id="de_email")
	 WebElement emailEditbox;
	
	@FindBy(id="de_confirmemail")
	 WebElement confirmemailEditbox;
		
	@FindBy(id="de_address")
	 WebElement hospitalNameEditbox;
	
	@FindBy(id="de_address2_postcode")
	 WebElement hospitalPostCodeEditbox;
	
	@FindBy(id="findaddress")
	 WebElement lookupButton1;
	
	@FindBy(id="de_address2_completeaddress")
	 WebElement hospitalAddressEditbox;
	
	@FindBy(id="de_address2_town")
	 WebElement hospitalTownEditbox;
	
	@FindBy(id="de_address2_county")
	 WebElement hospitalCountyEditbox;
			
	@FindBy(id="de_customPassword")
	 WebElement passwordEditbox;
	
	@FindBy(xpath="//input[@id='rdbListDonationAmount_2' and @value=10]")
	 WebElement radioOption;
		
	@FindBy(id="de_customConfirmPassword")
	 WebElement confirmpasswordEditbox;
		
	@FindBy(id="OrderPaymentIframe")
	 WebElement orderpaymentIframe;
	
	@FindBy(id="sagepayCcIframe")
	 WebElement sagepayIframe;
	
	@FindBy(id="form-card_details.field-pan")
	 WebElement accountnumberEditbox;
	
	@FindBy(id="form-card_details.field-expiry_mm")
	 WebElement expMonthEditbox;
	
	@FindBy(id="form-card_details.field-expiry_yy")
	 WebElement expYearEditbox;
	
	@FindBy(id="form-card_details.field-cvc")
	 WebElement cvvEditbox;
	
	@FindBy(xpath=".//button[@value='proceed']")
	 WebElement confircarddetailsButton;
	
	@FindBy(xpath=".//*[@id='addressList']/tbody/tr[1]/td/a")
	 WebElement hospaddressSelect;
	
	//Home Address Look-up button
	@FindBy(id="btnHospitalAddr_Postcode")
	WebElement lookupButton2;
	
	@FindBy(xpath="[@id='de_subclassification1_ref_lookupmodal']/div/section/div/div")
	WebElement modaldialog2;
	
	@FindBy(linkText="T&Cs apply")
	WebElement tclink;
	

	
	//Initialising WebElement on the page
	public WebJoinerPage(WebDriver driver){
		this.driver=driver;		
		PageFactory.initElements(driver, this);
	}
	
	//Launch Joiner Application
	public void openJoinersApplication(String joinersURL) throws InterruptedException{
							
		driver.get(joinersURL);							
		Thread.sleep(7000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Adxstudio Portals - Licensing")){
				Thread.sleep(11000);
				System.out.println("Reload refresh screen");
				driver.navigate().refresh();
			}
		else
				System.out.println("Succssfully Loaded Joiners Home page :: "+title+".");
				
	}
	
	//Examples of driver.close() and driver.quit() and Fluent wait
	public WebJoinerPage clickonTermAndConditionLink() throws Exception{
		
		/*		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(40, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		WebElement tclink1 = wait.until(new Function<WebDriver,WebElement>){
			public WebElement apply(WebDriver driver){
		 		    	return driver.findElement(By.linkText("T&Cs apply"));
		    }
					   
		});
		*/
		tclink.click();
		Thread.sleep(5000);
		SystemUtills.switchToWindowsPopup(driver);
		
		/*Close second tab in which new link is opened, if we have used driver.quit() then it would have closed all the tab.
		drive.close() closes current tab. */
		
		driver.close();
		//driver.quit();
		SystemUtills.switchToMainWindow(driver);
		return this;
		
			
	}
	
	
	//Method to verify Title of the page
	public boolean verifyHomePage(String joinerTitleInitials){
		return driver.getTitle().startsWith(joinerTitleInitials);
				
	}
		
	public WebJoinerPage selectMembershipProduct() throws InterruptedException, Exception {
		try{
		productListOption.click();
		SystemUtills.fn_clickOnButton(nextButton);
		//nextButton.click();
		Thread.sleep(5000);
		return this;
		}catch(Exception e){
			throw new Exception("Membership product is not found");
		}
		
				
	}
	
	// Example of Explicit wait
	public WebJoinerPage setTitle() throws InterruptedException{
					
			titleLookupButton.click();
			WebDriverWait  block = new WebDriverWait(driver,15);
			WebElement  modal1 = block.until(ExpectedConditions.visibilityOf(modalDialog1));
			Thread.sleep(5000);
			titleText.click();
			Thread.sleep(2000);
			modalSaveButton.click();
			Thread.sleep(3000);
			return this;	
		
	}
	
	
	public WebJoinerPage setForename(String forename) throws Exception {
		try{
			System.out.println("Input forename");
			SystemUtills.fn_inputValues(forenameEditbox, forename);
			return this;
		}
		catch(Exception e){
			throw new Exception("Forename field is not found");
		}
	}
	
	
	public WebJoinerPage setSurname(String surname) throws Exception {
		try{
			System.out.println("Input surname");
			SystemUtills.fn_inputValues(surnameEditbox, surname);
			return this;
		}catch(Exception e){
			throw new Exception("Surname field is not found");
		}
	}
	
	
	public WebJoinerPage selectGenderValue(String genderValue) throws Exception {
		try{
			SystemUtills.fn_selectValueByText(genderOptions, genderValue);
			return this;
		}catch(Exception e){
			throw new Exception("Gender field is not found");
		}
	}
	
	public WebJoinerPage setMobileNumber(String mobileNumber) throws Exception {
		try{
			SystemUtills.fn_inputValues(mobileEditbox, mobileNumber);
			return this;
		}catch(Exception e){
			throw new Exception("MobileNumber field is not found");
		}
	}
	
	public WebJoinerPage setWorkpostcode(String workpostcode) throws Exception {
		try{
			System.out.println("Input Workpostcode");
			SystemUtills.fn_inputValues(workpostcodeEditbox, workpostcode);
			return this;
		}catch(Exception e){
			throw new Exception("Workpostcode field is not found");
		}
	}
	
	public WebJoinerPage setWorkAddress(String workAddress) throws Exception {
		try{
			System.out.println("Input WorkAddress");
			SystemUtills.fn_inputValues(workaddressTextArea, workAddress);
			return this;
		}catch(Exception e){
			throw new Exception("WorkAddress field is not found");
		}
	}
	
	public WebJoinerPage setWorkTown(String workTown) throws Exception {
		try{
			System.out.println("Input workTown");
			SystemUtills.fn_inputValues(workTownEditBox, workTown);
			return this;
		}catch(Exception e){
			throw new Exception("workTown field is not found");
		}
	}
	
	public WebJoinerPage setWorkCounty(String workCounty) throws Exception {
		try{
			System.out.println("Input workCounty");
			SystemUtills.fn_inputValues(workCountyEditBox, workCounty);
			return this;
		}catch(Exception e){
			throw new Exception("workCounty field is not found");
		}
	}
	
	public WebJoinerPage setEmailId(String emailText) throws Exception {
		try{
			System.out.println("Input Email address");
			SystemUtills.fn_inputValues(emailEditbox, emailText);
			return this;
		}catch(Exception e){
			throw new Exception("Email address field is not found");
		}
	}
	
	public WebJoinerPage setConfirmEmailId(String confirmemailText) throws Exception {
		try{
			System.out.println("Input Confirm Email address");
			SystemUtills.fn_inputValues(confirmemailEditbox, confirmemailText);
			return this;
		}catch(Exception e){
			throw new Exception("Confirm EmailEditbox field is not found");
		}
	}
	
	
	public WebJoinerPage setHospitalName(String hospitalNameText) throws Exception {
		try{
			System.out.println("Input Hospital Name ");
			SystemUtills.fn_inputValues(hospitalNameEditbox, hospitalNameText);
			return this;
		}catch(Exception e){
			throw new Exception("Hospital Name field is not found");
		}
	}
	
	public WebJoinerPage setHospitalPostCode(String hospitalPostCodeText) throws Exception {
		try{
			System.out.println("Input Hospital Postcode ");
			SystemUtills.fn_inputValues(hospitalPostCodeEditbox, hospitalPostCodeText);
			return this;
		}catch(Exception e){
			throw new Exception("Hospital Post code field is not found");
		}
	}
	
	
	public WebJoinerPage setHospitalAddress(String hospitalAddressText) throws Exception {
		try{
			System.out.println("Input Hospital Address");
			SystemUtills.fn_inputValues(hospitalAddressEditbox, hospitalAddressText);
			return this;
		}catch(Exception e){
			throw new Exception("Hospital Address field is not found");
		}
	}
	
	
	public WebJoinerPage setHospitalTown(String hospitalTownText) throws Exception {
		try{
			System.out.println("Input Hospital Town ");
			SystemUtills.fn_inputValues(hospitalTownEditbox, hospitalTownText);
			return this;
		}catch(Exception e){
			throw new Exception("Hospital town field is not found");
		}
	}
	
	
	public WebJoinerPage setHospitalCounty(String hospitalCountyText) throws Exception {
		try{
			System.out.println("Input Hospital County ");
			SystemUtills.fn_inputValues(hospitalCountyEditbox, hospitalCountyText);
			return this;
		}catch(Exception e){
			throw new Exception("Hospital County field is not found");
		}
	}
	
	public WebJoinerPage setPassword(String passwordText) throws Exception {
		try{
			System.out.println("Input password ");
			SystemUtills.fn_inputValues(passwordEditbox, passwordText);
			return this;
		}catch(Exception e){
			throw new Exception("password field is not found");
		}
	}
	
	public WebJoinerPage setConfirmPassword(String confirmpasswordText) throws Exception {
		try{
			System.out.println("Input confirm password ");
			SystemUtills.fn_inputValues(confirmpasswordEditbox, confirmpasswordText);
			return this;
		}catch(Exception e){
			throw new Exception("Confirm password field is not found");
		}
	}
	
	
	public WebJoinerPage setPrimaryInterest() throws InterruptedException {
		
		pinterestLookupButton.click();
		
		Thread.sleep(5000);
		pInterestText.click();
		Thread.sleep(2000);
		modalSaveButton2.click();
		Thread.sleep(3000);
		return this;
		
	
}
	
	//method to select donations radio options
	public WebJoinerPage selectDonationAmt() throws Exception, InterruptedException{
		try{
		System.out.println("Click on Radio button");
		radioOption.click();
		Thread.sleep(5000);
		return this;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
				
	}
	
	
	//Method to select Hospital address from pop-up window	
	public WebJoinerPage selectHospAddressFromPostCode() throws Exception {
		try{
			SystemUtills.fn_clickOnButton(lookupButton1);
			SystemUtills.switchToWindowsPopup(driver);
			hospaddressSelect.click();
			SystemUtills.switchToMainWindow(driver);
			return this;
		}catch(Exception e){
			throw new Exception("Unable to select address from Post code look-up");
		}
		
	}
	
	//Method to select Home address from pop-up window	
	public WebJoinerPage selectHomeAddressFromPostCode() throws Exception {
			try{
				SystemUtills.fn_clickOnButton(lookupButton2);
				SystemUtills.switchToWindowsPopup(driver);
				hospaddressSelect.click();
				SystemUtills.switchToMainWindow(driver);
				return this;
			}catch(Exception e){
				throw new Exception("Unable to select address from Post code look-up");
			}
			
		}

	//Method to move on next step
	public WebJoinerPage clickNextButton() throws Exception, InterruptedException{
			try{
			System.out.println("Click on Next button");
			SystemUtills.fn_clickOnButton(nextButton);
			Thread.sleep(5000);
			return this;
			}catch(Exception e){
				throw new Exception(e.getMessage());
			}
					
		}
	
		
	// Method to enter payment details in one go.
	public WebJoinerPage addPaymentdetails(String acNumber, String expMonth, String expYear, String cvvNumber)throws Exception, InterruptedException{
			try{
			System.out.println("Click on Procced to Payments");
			SystemUtills.fn_switchToIFrame(orderpaymentIframe, driver);
			Thread.sleep(1000);
			SystemUtills.fn_switchToIFrame(sagepayIframe, driver);
			Thread.sleep(1000);
			SystemUtills.fn_inputValues(accountnumberEditbox, acNumber);
			SystemUtills.fn_inputValues(expMonthEditbox, expMonth);
			SystemUtills.fn_inputValues(expYearEditbox, expYear);
			SystemUtills.fn_inputValues(cvvEditbox, cvvNumber);
			SystemUtills.fn_clickOnButton(confircarddetailsButton);
			Thread.sleep(20000);
			return this;
				
			}catch(Exception e){
				throw new Exception(e.getMessage());
			}
		
		
	}
	
	//Method verify that Membership is confirmed successfully and confirmation Text is shown
	public boolean verifyConfirmationText(){
		boolean textFound = false;  
		try {
		    driver.findElement(By.xpath("//*[contains(text(),'An application has been made for')]"));
		    textFound = true;
		    return textFound;
		} catch (Exception e) {
		    textFound = false;
		    return textFound;
		}
		
				
	}
	
	
}