package com.obsequra.testscripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsequra.pages.AddPage;
import com.obsequra.pages.AdminUserPage;
import com.obsequra.pages.HomePage;
import com.obsequra.pages.ListPage;
import com.obsequra.pages.LoginPage;
import com.obsequra.utilties.ExcelUtility;

public class PasswordDisplayingTest extends TestHelper {
	LoginPage login;
	HomePage home;
	AdminUserPage admin;
	@Test
	public void tc_007_verifyPassword() {
		List<ArrayList<String>> data = ExcelUtility.excelDataReader("LoginPage");
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		login = new LoginPage(driver);
		login.userLogin(username,password); 
		home=new HomePage(driver);
		home.clickManageUsers();
		admin=new AdminUserPage(driver);
		admin.clickPasswordDropDown();
		Assert.assertTrue(admin.isPasswordDisplayed("Password : redt_08_07_2023_12_05_51"));

}
}