package com.obsequra.testscripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.obsequra.pages.HomePage;
import com.obsequra.pages.ListDeleveryPage;
import com.obsequra.pages.LoginPage;
import com.obsequra.utilties.ExcelUtility;
public class AddUserTest extends TestHelper {
	LoginPage login;
	HomePage home;
	@Test
	public void tc_009_addAdminUsers() {
		List<ArrayList<String>> data = ExcelUtility.excelDataReader("LoginPage");
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		login = new LoginPage(driver);
		login.userLogin(username,password);
		home=new HomePage(driver);
		home.ManageUsers_AddUsers("selenium", "11111");
		
}
}