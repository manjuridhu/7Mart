package com.obsequra.testscripts;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsequra.pages.AddPage;
import com.obsequra.pages.EditPage;
import com.obsequra.pages.HomePage;
import com.obsequra.pages.ListPage;
import com.obsequra.pages.LoginPage;
import com.obsequra.utilties.ExcelUtility;

public class EditTest extends TestHelper {
	LoginPage login;
	ListPage list;
	HomePage home;
	AddPage add;
	EditPage edit;
	@Test
	public void tc_004_verifyEditPage() {
		List<ArrayList<String>> data = ExcelUtility.excelDataReader("LoginPage");
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		String expectitle= data.get(1).get(2);
		login = new LoginPage(driver);
		login.userLogin(username, password);
		home=new HomePage(driver);
		home.ManagePages_EditPages("Hello","World");
		EditPage edit=new EditPage(driver);
		Assert.assertTrue(edit.isElementDisplayed());
		


}
}