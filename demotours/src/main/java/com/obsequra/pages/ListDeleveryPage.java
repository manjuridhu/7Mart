package com.obsequra.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsequra.utilties.PageUtility;

public class ListDeleveryPage extends PageUtility{
	WebDriver driver;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")
	WebElement newButton;
	@FindBy(xpath="//table/tbody/tr[1]/td[1]")
	WebElement Test;
	public ListDeleveryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewButton() {
	newButton.click();
}
	public boolean isnameIsDisplayed() {
		try {
			if(Test.isDisplayed()) {
				return true;
			}
			return false;
		}
		catch (Exception e) {
			return false;
		}
		}
}