package com.obsequra.testscripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsequra.pages.AddPage;
import com.obsequra.pages.HomePage;
import com.obsequra.pages.ListPage;
import com.obsequra.pages.LoginPage;
import com.obsequra.pages.SearchPage;
import com.obsequra.utilties.ExcelUtility;

public class SearchTest extends TestHelper{
	LoginPage login;
	HomePage home;
	SearchPage search;
	@Test
	public void tc_006_searchPage() {
		List<ArrayList<String>> data = ExcelUtility.excelDataReader("LoginPage");
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		login = new LoginPage(driver);
		login.userLogin(username, password);
		home=new HomePage(driver);
		home.ManagePages_SearchPages("Flower");
		search=new SearchPage(driver);
		Assert.assertTrue(search.isElementDisplayed());
}		
}
