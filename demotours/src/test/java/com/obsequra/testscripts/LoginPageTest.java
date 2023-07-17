package com.obsequra.testscripts;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.obsequra.pages.HomePage;
import com.obsequra.pages.LoginPage;
import com.obsequra.utilties.*;
import com.obsqura.listeners.ReportListeners;
import org.testng.asserts.SoftAssert;
@Listeners(ReportListeners.class)

	public class LoginPageTest extends TestHelper {
	LoginPage login;
	@Test
	public void tc_001_verifyLoginWithValidCreds() {
		List<ArrayList<String>> data = ExcelUtility.excelDataReader("LoginPage");
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		login = new LoginPage(driver);
		login.userLogin(username,password);
		HomePage home=new HomePage(driver);
		Assert.assertTrue(home.isHomePageLoaded());
		
		
}
	@Test(dataProvider = "InvalidCreds")
	public void tc_002_verifyLoginWithInvalidCreds(String username, String password) {
		login = new LoginPage(driver);
		login.userLogin(username,password);
		HomePage home=new HomePage(driver);
		Assert.assertFalse(home.isHomePageLoaded());
		}
	@DataProvider(name = "InvalidCreds")
	public Object[][] userCredentials() {
		Object[][] data = { { "admin", "admin1" }, { "admin1", "admin" }, { "admin12", "admin21" } };
		return data;
	}
}
