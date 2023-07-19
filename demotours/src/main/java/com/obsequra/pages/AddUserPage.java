package com.obsequra.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsequra.utilties.PageUtility;

public class AddUserPage extends PageUtility{
	public WebDriver driver;
	@FindBy(xpath="//*[@id='username']")
	WebElement username;
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	@FindBy(xpath="//*[@id='user_type']")
	WebElement usertypedropdown;
	@FindBy(xpath="//*[@type='submit']")
	WebElement savebutton;
	@FindBy(xpath="//table/tbody/tr[1]/td[1]")
	WebElement selenium1;
	public AddUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String user_name) {
		username.sendKeys(user_name);
	}
	public void enterPassword(String pass_word) {
		password.sendKeys(pass_word);
	}
	public void selectUserType() {
		usertypedropdown.click();
		
	}
	public void clickSaveButton() {
		savebutton.sendKeys(Keys.ENTER);
	}
	public void addUser(String username,String password) {
		enterUserName(username);
		enterPassword(password);
		selectUserType();
		clickSaveButton();
	}
	public boolean isUserDisplayed() {
		if(selenium1.isDisplayed()) {
			return true;
		}
		return false;
	
	}

}
