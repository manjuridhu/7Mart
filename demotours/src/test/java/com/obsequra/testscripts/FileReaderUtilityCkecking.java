package com.obsequra.testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.obsequra.utilties.*;

public class FileReaderUtilityCkecking {

	@Test
	public void FileReader_Test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FileReaderUtility fr = new FileReaderUtility();
		// driver.get(fr.getApplicationUrl());
		String s = fr.getApplicationUrl();
		System.out.println(s);
	}

}
