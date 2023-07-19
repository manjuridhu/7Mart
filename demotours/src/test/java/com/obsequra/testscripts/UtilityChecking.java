package com.obsequra.testscripts;
import java.io.IOException;

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
public void ExcelRead_Test() throws IOException {
	  ExcelUtility e=new ExcelUtility();
		System.out.println("The Excel Sheet Data are:");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				//System.out.print(e.readData(i, j)+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Ending of the pgm");
}
public void StringUtilityCheck() {
	StringUtility su=new StringUtility();
	int l=su.StringLength();
	System.out.println(l);
	char ch=su.charactor();
	System.out.println(ch);
	String s1=su.concatString();
	System.out.println(s1);
	boolean b1=su.stringEquals();
	System.out.println(b1);
	boolean b2=su.stringEqualIgnore();
	System.out.println(b2);
	String s2=su.returnUpperCase();
	System.out.println(s2);
	String s3=su.returnLowerCase();
	System.out.println(s3);
	String s4=su.replaceLetter();
	System.out.println(s4);
}
public void FileReaderChecking() {
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	FileReaderUtility fr = new FileReaderUtility();
	// driver.get(fr.getApplicationUrl());
	String s = fr.getApplicationUrl();
	System.out.println(s);
}
public void pageutilityChecking(){

	/*System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

	PageUtility pu=new PageUtility(driver);

	String url=pu.getPageUrl(WebDriver driver);

	System.out.println("Current Url:"+url);

	String title=pu.getPageTitle(WebDriver driver);

	System.out.println("Page Title:"+title);

}*/	

}
}




