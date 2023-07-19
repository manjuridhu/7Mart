package com.obsequra.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.obsequra.utilties.*;
import com.obsequra.pages.*;

public class HomePage extends PageUtility {
	WebDriver driver;
	@FindBy(xpath = "//nav/ul[2]/li/a")
	WebElement Admin;

	@FindBy(xpath = "//nav/ul/li[1]/a")
	WebElement Dashboard;

	@FindBy(xpath = "//section/div/div/div[1]/div/a")
	WebElement ManagePages;

	@FindBy(xpath = "//section/div/div/div[2]/div/a")
	WebElement ManageUsers;

	@FindBy(xpath = "//section/div/div/div[9]/div/a")
	WebElement ManageDeleveryBoy;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isHomePageLoaded() {
		try {
			if (Admin.isDisplayed() && Dashboard.isDisplayed()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public void ManagePages_AddPages(String title, String pagename) {
		clickManagePages();
		ListPage lp = new ListPage(driver);
		lp.AddPages(title, pagename);
	}

	public void ManagePages_EditPages(String title, String pagename) {
		clickManagePages();
		ListPage lp = new ListPage(driver);
		lp.clickOnEditButton();
		EditPage edit = new EditPage(driver);
		edit.EditPage(title, pagename);
	}

	public void ManagePages_DeletePage(String title) {
		clickManagePages();
		ListPage lp = new ListPage(driver);
		lp.clickDeleteButton();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.navigate().back();
	}

	public void ManagePages_SearchPages(String title) {
		clickManagePages();
		ListPage lp = new ListPage(driver);
		lp.clickSearchButton();
		SearchPage search = new SearchPage(driver);
		search.searchPage(title);
	}

	public void clickManagePages() {
		ManagePages.click();

	}

	public void ManageUsers_AddUsers(String username, String password) {
		clickManageUsers();
		AdminUserPage admin = new AdminUserPage(driver);
		admin.clickOnNewButton();
		AddUserPage add = new AddUserPage(driver);
		add.addUser(username, password);
	}

	public void clickManageUsers() {
		ManageUsers.click();

	}

	public void clickManageDeleveryBoy() {
		ManageDeleveryBoy.click();
	}

	public void ManageDeleveryBoy_AddDeliveryBoy(String name, String username, String password, String phonenumber) {
		clickManageDeleveryBoy();
		ListDeleveryPage list = new ListDeleveryPage(driver);
		list.clickNewButton();
		AddDeleveryBoyPage add = new AddDeleveryBoyPage(driver);
		add.addDeleveryBoy(name, username, password, phonenumber);
	}
}
