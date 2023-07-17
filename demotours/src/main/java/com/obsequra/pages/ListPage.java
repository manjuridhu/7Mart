package com.obsequra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsequra.utilties.PageUtility;

public class ListPage extends PageUtility{
	public WebDriver driver;
	@FindBy(xpath = "/html/body/div/div[1]/section/div[1]/a[1]")
	WebElement newButton;
	@FindBy(xpath = "/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[5]/a[1]/i")
	WebElement EditButton;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[5]/a[2]/i")
	WebElement DeleteButton;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]/i")
	WebElement searchButton;
	@FindBy(xpath="//table/tbody/tr[2]/td[1]")
	WebElement Game;
	@FindBy(xpath="//table/tbody/tr[2]/td[1]")
	WebElement Jasmin;
	public ListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnNewButton() {
		newButton.click();
	}
	public void clickOnEditButton() {
		EditButton.click();
	}
	public void clickDeleteButton() {
		DeleteButton.click();
	}
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void AddPages(String title,String pagename) {
		clickOnNewButton();
		AddPage ap=new AddPage(driver);
		ap.enterPageDetails(title,pagename);
	}
	public boolean isElementDisplayed() {
		if(Game.isDisplayed()) {
			return true;
		}
		return false;
	}
	public boolean isPageDeleted() {
		if(Jasmin.isDisplayed()) {
			return false;
		}
		return true;
	}
	
	public boolean isAddedPageIsDisplayed(String Title,String PageName) {
		WebElement page=getWebElementOfTable("Title",Title,"Page",driver);
		if(page.getText().equalsIgnoreCase(PageName)) {
			return true;
		}
		return false;
	}
	}
	

