package com.obsequra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsequra.utilties.PageUtility;

public class LoginPage extends PageUtility {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/div/div/div[1]/input") 
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/div/div/div[2]/input") 
	WebElement password;
	
	@FindBy(xpath = "//*[@id='login-form']//button") 
	WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String user_name) {
		username.sendKeys(user_name);
	}
		
	public void enterPassword(String pass_word) {
			password.sendKeys(pass_word);
	}
	
	public void clickOnLogin() {
		loginbutton.click();
	}
	
	public void userLogin(String user_name,String pass_word) {
	    enterUsername(user_name);
		enterPassword(pass_word);
		clickOnLogin();
		
	}
}

	
	







	

	


