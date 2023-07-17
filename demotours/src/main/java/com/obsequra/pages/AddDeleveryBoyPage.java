package com.obsequra.pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.obsequra.utilties.PageUtility;
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

public AddDeleveryBoyPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void enterName(String Name) {
	name.sendKeys("Tester");
}
public void enterPhoneNumber(int number) {
	phonenumber.sendKeys("123456789");
}
public void enterUserName(String Username) {
	username.sendKeys("Tester1");
}
public void enterPassword(String Password) {
	password.sendKeys("12345");
}
public void clickSaveButton() {
	WebElement we = driver.findElement(By.xpath("//*[@id='form']/div/div[7]/button"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", we);
	savebutton.click();
}
public void addDeleveryBoy(String Name,String Username,String Password,int number) {
	enterName(Name);
	enterPhoneNumber(number);
	enterUserName(Username);
	enterPassword(Password);
	clickSaveButton();
	
}
}