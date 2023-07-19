package com.obsequra.testscripts;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsequra.pages.AddDeleveryBoyPage;
import com.obsequra.pages.AddPage;
import com.obsequra.pages.AdminUserPage;
import com.obsequra.pages.HomePage;
import com.obsequra.pages.ListDeleveryPage;
import com.obsequra.pages.ListPage;
import com.obsequra.pages.LoginPage;
import com.obsequra.utilties.ExcelUtility;

public class DeleveryBoyTest extends TestHelper{
	LoginPage login;
	ListPage list;
	HomePage home;
	AdminUserPage admin;
	AddDeleveryBoyPage delevery;
	ListDeleveryPage list1;
	//@Test
	public void tc_010_addDeleveryBoy() {
		List<ArrayList<String>> data = ExcelUtility.excelDataReader("LoginPage");
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		login = new LoginPage(driver);
		login.userLogin(username,password);
		home=new HomePage(driver);
		home.clickManageDeleveryBoy();
		admin=new AdminUserPage(driver);
		admin.clickOnNewButton();
		delevery=new AddDeleveryBoyPage(driver);
		delevery.addDeleveryBoy("Manu","Manus","12345","123456789");
		list1=new ListDeleveryPage(driver);
		Assert.assertTrue(list1 .isnameIsDisplayed("Manu","Manus"));
	}
}
