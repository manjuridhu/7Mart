package com.obsequra.testscripts;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsequra.pages.HomePage;
import com.obsequra.pages.ListPage;
import com.obsequra.pages.LoginPage;
import com.obsequra.utilties.ExcelUtility;

public class DeleteTest extends TestHelper {

	LoginPage login;
	HomePage home;
	ListPage list;
	@Test
	public void tc_005_DeletePage() {
	List<ArrayList<String>> data = ExcelUtility.excelDataReader("LoginPage");
	String username = data.get(1).get(0);
	String password = data.get(1).get(1);
	login = new LoginPage(driver);
	login.userLogin(username, password);
	home=new HomePage(driver);
	home.ManagePages_DeletePage("Jasmin");
	list=new ListPage(driver);
	Assert.assertTrue(list.isElementDisplayed());
	}
}
