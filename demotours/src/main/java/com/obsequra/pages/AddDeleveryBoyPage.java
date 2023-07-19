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
import org.openqa.selenium.support.ui.WebDriverWait;
import com.obsequra.utilties.PageUtility;
import com.obsequra.utilties.WaitUtility;
public class AddDeleveryBoyPage extends PageUtility {
	WebDriver driver;
	@FindBy(xpath="//*[@id='name']")
	WebElement name;
	@FindBy(xpath="//*[@id='phone']")
	WebElement phonenumber;
	@FindBy(xpath="//*[@id='username']")
	WebElement username;
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	@FindBy(xpath="//*[@id='form']/div/div[7]/button")
	WebElement savebutton;
	WaitUtility wu;
public AddDeleveryBoyPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void enterName(String Name) {
	name.sendKeys(Name);
}
public void enterPhoneNumber(String num) {
	phonenumber.sendKeys(num);
}
public void enterUserName(String Username) {
	username.sendKeys(Username);
}
public void enterPassword(String Password) {
	password.sendKeys(Password);
}
public void clickSaveButton() {
	savebutton.sendKeys(Keys.ENTER);
}
public void addDeleveryBoy(String Name,String Username,String Password,String num) {
	enterName(Name);
	enterPhoneNumber(num);
	enterUserName(Username);
	enterPassword(Password);
	clickSaveButton();
	
}
}