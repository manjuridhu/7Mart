package com.obsequra.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obsequra.utilties.PageUtility;

public class AdminUserPage extends PageUtility {
public WebDriver driver;	
@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")
WebElement newButton;
@FindBy(xpath="//table/tbody/tr[1]/td[4]/div/a")
WebElement passworddropdown;
@FindBy(xpath="/html/body/div/div[1]/section/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[3]/a/span")
WebElement status;
public AdminUserPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void clickOnNewButton() {
	newButton.click();
}
public void clickPasswordDropDown() {
	passworddropdown.click();
	
}
public void clickStatusButton() {
	status.click();
}
public boolean isPasswordDisplayed(String user,WebDriver driver) {
	clickPasswordDropDown();
	WebElement password=getWebElementOfTable("Name",user,"Password",driver);
	if(password.isDisplayed()) {
		return true;
	}
	return false;
}
}