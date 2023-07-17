package com.obsequra.testscripts;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.obsequra.pages.HomePage;
import com.obsequra.pages.LoginPage;
import com.obsequra.utilties.ExcelUtility;

public class HomePageTest extends TestHelper {
	public WebDriver driver;
	LoginPage login;
	@Test
	public void tc_002_verifyLoginWithInValidCreds(String username,String password) {
		login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();
		HomePage home=new HomePage(driver);
		Assert.assertFalse(home.isHomePageLoaded());
		}
	@DataProvider(name = "InvalidCreds")
	public Object[][] userCredentials() {
		Object[][] data = { { "admin", "admin1" }, { "admin1", "admin" }, { "admin12", "admin21" } };
		return data;
	}
}

	


