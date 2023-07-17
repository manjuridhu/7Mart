package com.obsequra.testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.obsequra.utilties.*;
public class UtilityChecking {
	
	WebDriver driver;
@Test
public void dateUtilityChecking() {
	
DateUtility du=new DateUtility();
String date1=du.currentDate();
System.out.println("Current date:"+date1);
date1=du.SingleFormatDate();
System.out.println("Current Date in Single Format:"+date1);
date1=du.currentTimeDate();
System.out.println("Current Time and Date:"+date1);
}
@Test
public void FileReader_Test() {
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	FileReaderUtility fr=new FileReaderUtility();
	driver.get(fr.getApplicationUrl());
}
}