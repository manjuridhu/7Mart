package com.obsequra.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsequra.utilties.PageUtility;

public class EditPage extends PageUtility{
	public WebDriver driver;
	@FindBy(xpath="//*[@id='title']")
	WebElement title;
	@FindBy(xpath="//*[@id='page']")
	WebElement page;
	@FindBy(xpath="//*[@id='form']/div/div[5]/button")
	WebElement updatebutton;
	@FindBy(xpath="//table/tbody/tr[1]/td[1]")
	WebElement Hello;
	@FindBy(xpath="//table/tbody/tr[1]/td[4]")
	WebElement World;
	
	public EditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterTitle(String Title ) {
		title.clear();
		title.sendKeys(Title);
	}
	public void enterPageName(String PageName) {
		page.clear();
		page.sendKeys(PageName);
	}
	public void clickUpdateButton() {
		updatebutton.click();
	}
	public void EditPage(String title,String pagename) {
		enterTitle(title);
		enterPageName(pagename);
		clickUpdateButton();
	}
	public boolean isElementDisplayed() {
		if(Hello.isDisplayed()&&(World.isDisplayed())) {
			return true;
		}
		return false;
	
	}
}
