package com.obsequra.testscripts;
import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.obsequra.utilties.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHelper {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "chromebrowser" })
	public void BrowserLaunch(@Optional("chrome") String browser) {
		FileReaderUtility fr = new FileReaderUtility();
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", fr.getchromeDriverPath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", fr.getedgeDriverPath());
			driver = new EdgeDriver();
		}
		driver.navigate().to(fr.getApplicationUrl());
	}

	// @Test
	public void test() {
		System.out.println("Welcome");

	}

	@AfterMethod
	/*public void screenShot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				String path = System.getProperty("user.dir");
				FileUtils.copyFile(src, new File(path + "\\target" + result.getName() + ".png"));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {

				System.out.println("Exception while taking screenshot " + e.getMessage());
			}*/
		public void driverClose() {
		driver.quit();

	}
}

