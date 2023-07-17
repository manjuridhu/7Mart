package com.obsequra.testscripts;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsequra.pages.AddPage;
import com.obsequra.pages.HomePage;
import com.obsequra.pages.ListPage;
import com.obsequra.pages.LoginPage;
import com.obsequra.utilties.ExcelUtility;
import com.obsequra.utilties.PageUtility;
public class ListTest extends TestHelper {
	LoginPage login;
	ListPage list;
	HomePage home;
	AddPage add;
	@Test
	public void tc_003_verifyAddListPage() {
		List<ArrayList<String>> data = ExcelUtility.excelDataReader("LoginPage");
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		login = new LoginPage(driver);
		login.userLogin(username,password);
		home=new HomePage(driver);
		home.ManagePages_AddPages("Mangos1","Fruity1");
		list=new ListPage(driver);
		Assert.assertTrue(list.isAddedPageIsDisplayed("Mangos1","Fruity1"));
}
}
