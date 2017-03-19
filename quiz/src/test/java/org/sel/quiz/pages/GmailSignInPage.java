package org.sel.quiz.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailSignInPage {

		
		private WebDriver driver;
		
		@FindBy(xpath="//input[@id='Email' and @placeholder='Email or phone']")
		WebElement inputEmail;
		
		@FindBy(id="next")
		WebElement nextButton;
		
		@FindBy(css="input#Passwd[name=’Passwd’]")
		WebElement inputPwd;
		
		//Absolute & Relative Xpaths
				
		@FindBy(xpath="//input[@id='signIn']")
		WebElement signInButtonRelative;
		
		@FindBy(xpath="html/body/div[1]/div[2]/div[2]/form[1]/input[19]")
		WebElement signInButtonAbsolute;
		
		
		@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
		WebElement composeButton;
		
		@FindBy(xpath="//a[contains(text(),'Create account')]")
		WebElement createNewAc;	
		
		
		public GmailSignInPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public GmailSignInPage openJoinersApplication(String appUrl) throws InterruptedException{
			driver.get(appUrl);							
			Thread.sleep(7000);
			String title = driver.getTitle();
			System.out.println(title);
			return this;
		}
		
		
		public GmailSignInPage setEmailId(String loginId){
			inputEmail.clear();
			inputEmail.sendKeys(loginId);
			return this;
		}
		
		public GmailSignInPage clickNextButton(){
		if(nextButton.isDisplayed() && nextButton.isEnabled()) {
				nextButton.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else
				System.out.println("Either button is not displayed or disabled");
			return this;	
		}
		
		
		public GmailSignInPage setPassword(){
					
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('Passwd').value = 'Game@123';");
			return this;
			
		}
		
		public GmailSignInPage clickSignInButtonRelative() throws InterruptedException{
			
			if(signInButtonRelative.isDisplayed() && signInButtonRelative.isEnabled()){
				signInButtonRelative.click();
			
				Thread.sleep(10000);
			}
			else
				System.out.println("Either button is not displayed or disabled");
			return this;
			
		}
		
		public GmailSignInPage clickSignInButtonAbsolute() throws InterruptedException{
			
			if(signInButtonAbsolute.isDisplayed() && signInButtonAbsolute.isEnabled()){
				signInButtonAbsolute.click();
			
				Thread.sleep(10000);
			}
			else
				System.out.println("Either button is not displayed or disabled");
			return this;
			
		}
		
		
		
		public boolean verifyTitle(String title){
			
			String a = driver.getTitle();
			if(a.equalsIgnoreCase(title)){
				return true;
			}
			else{
				return false;
			}
			
		}
	
}