package com.obsequra.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsequra.utilties.PageUtility;
import com.obsequra.utilties.WaitUtility;

public class AddPage extends PageUtility {
	public WebDriver driver;
	@FindBy(xpath="//*[@id='title']")
	WebElement title;
	
	@FindBy(xpath="//*[@id='page']")
	WebElement page;
	
	@FindBy(xpath="//*[@id='form']/div/div[5]/button")
	WebElement savebutton;
	

	public AddPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	public void enterTitle(String Title ) {
		title.sendKeys(Title);
	}
	public void enterPageName(String PageName) {
		page.sendKeys(PageName);
	}
	public void clickSaveButton() {
		savebutton.sendKeys(Keys.ENTER);
	}
	public void enterPageDetails(String Title,String PageName) {
		enterTitle(Title);
		enterPageName(PageName);
		clickSaveButton();
		driver.navigate().back();
		driver.navigate().back();
		
	}
	}
