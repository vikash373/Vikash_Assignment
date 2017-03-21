package org.sel.quiz.OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebJoinerPageOR {
	
	public WebDriver driver;
	
	/* Web Elements */
	
	@FindBy(xpath=".//*[@id='productList']/tbody/tr[1]/td/input[2]")
	protected WebElement productListOption;

	@FindBy(id="NextButton")
	protected WebElement nextButton;
	
	@FindBy(xpath=".//*[@id='EntityFormView']/div[2]/div[1]/div/fieldset[1]/table/tbody/tr[1]/td[1]/div[2]/div[1]/div/button[2]")
	protected WebElement titleLookupButton;
	
	@FindBy(xpath=".//*[@id='EntityFormView']/div[2]/div[2]/div/fieldset/table/tbody/tr[12]/td[1]/div[2]/div[1]/div/button[2]")
	protected WebElement pinterestLookupButton;
	
	@FindBy(className="modal-content")
	protected WebElement modalDialog1;
	
	@FindBy(xpath=".//button[text()='Select']")
	protected WebElement modalSaveButton;
	
	@FindBy(id="de_surname")
	protected WebElement surnameEditbox;
	
	@FindBy(id="de_forename")
	protected WebElement forenameEditbox;
	
	@FindBy(xpath="//td[text()='Dr']")
	protected WebElement titleText;
	
	//*[@id='de_subclassification1_ref_lookupmodal']/div/section/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]
	
	@FindBy(xpath="//td[contains(text(),'E.N.T.')]")
	protected WebElement pInterestText;
	
	@FindBy(xpath=".//*[@id='de_subclassification1_ref_lookupmodal']/div/section/div/div/div[3]/button[1]")
	protected WebElement modalSaveButton2;
	
	@FindBy(id="de_contactgender")
	protected WebElement genderOptions;
	
	@FindBy(id="de_honours")
	protected WebElement qualificationEditbox;
	
	@FindBy(id="de_mobile")
	protected WebElement mobileEditbox;
	
	@FindBy(id="de_postcode")
	protected WebElement workpostcodeEditbox;
	
	@FindBy(id="btnHospitalAddr_Postcode")
	protected WebElement workPostcodeButton;
		
	@FindBy(id="de_completeaddress")
	protected WebElement workaddressTextArea;
	
	@FindBy(id="de_town")
	protected WebElement workTownEditBox;
	
	@FindBy(id="de_county")
	protected WebElement workCountyEditBox;
	
	@FindBy(id="de_email")
	protected WebElement emailEditbox;
	
	@FindBy(id="de_confirmemail")
	protected WebElement confirmemailEditbox;
		
	@FindBy(id="de_address")
	protected WebElement hospitalNameEditbox;
	
	@FindBy(id="de_address2_postcode")
	protected WebElement hospitalPostCodeEditbox;
	
	@FindBy(id="findaddress")
	protected WebElement lookupButton1;
	
	@FindBy(id="de_address2_completeaddress")
	protected WebElement hospitalAddressEditbox;
	
	@FindBy(id="de_address2_town")
	protected WebElement hospitalTownEditbox;
	
	@FindBy(id="de_address2_county")
	protected WebElement hospitalCountyEditbox;
			
	@FindBy(id="de_customPassword")
	protected WebElement passwordEditbox;
	
	@FindBy(xpath="//input[@id='rdbListDonationAmount_2' and @value=10]")
	protected WebElement radioOption;
		
	@FindBy(id="de_customConfirmPassword")
	protected WebElement confirmpasswordEditbox;
		
	@FindBy(id="OrderPaymentIframe")
	protected WebElement orderpaymentIframe;
	
	@FindBy(id="sagepayCcIframe")
	protected WebElement sagepayIframe;
	
	@FindBy(id="form-card_details.field-pan")
	protected WebElement accountnumberEditbox;
	
	@FindBy(id="form-card_details.field-expiry_mm")
	protected WebElement expMonthEditbox;
	
	@FindBy(id="form-card_details.field-expiry_yy")
	protected WebElement expYearEditbox;
	
	@FindBy(id="form-card_details.field-cvc")
	protected WebElement cvvEditbox;
	
	@FindBy(xpath=".//button[@value='proceed']")
	protected WebElement confircarddetailsButton;
	
	@FindBy(xpath=".//*[@id='addressList']/tbody/tr[1]/td/a")
	protected WebElement hospaddressSelect;
	
	//Home Address Look-up button
	@FindBy(id="btnHospitalAddr_Postcode")
	protected WebElement lookupButton2;
	
	@FindBy(xpath="[@id='de_subclassification1_ref_lookupmodal']/div/section/div/div")
	protected WebElement modaldialog2;
	
	@FindBy(linkText="T&Cs apply")
	protected WebElement tclink;
	
	public WebJoinerPageOR(WebDriver driver){
		this.driver=driver;		
		PageFactory.initElements(driver, this);
	}
	
	


}
