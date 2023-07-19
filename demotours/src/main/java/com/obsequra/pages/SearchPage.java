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

public class SearchPage extends PageUtility {
	public WebDriver driver;
	@FindBy(xpath="//section/div[1]/a[2]")
	WebElement searchicon;
	@FindBy(xpath="//form/div/div[1]/input")
	WebElement title;
	@FindBy(xpath="//form/div/div[2]/button")
	WebElement  searchbutton;
	@FindBy(xpath="//table/tbody/tr[1]/td[1]")
	WebElement Flower;
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	public void clickSearchIcon() {
		searchicon.click();
	}
	public void enterTitle(String Title) {
		title.sendKeys(Title);
	}
	public void clickSearchButton(){
		searchbutton.click();
	}
	public void searchPage(String Title) {
		clickSearchIcon();
		enterTitle(Title);
		clickSearchButton();
	}
	public boolean isElementDisplayed() {
		if(Flower.isDisplayed()) {
			return true;
		}
		return false;
	}
	}
