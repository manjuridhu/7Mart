package com.obsequra.utilties;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PageUtility {
	public WebDriver driver;

	public String getPageUrl(WebDriver driver) {
		return (driver.getCurrentUrl());
	}

	public String getPageTitle(WebDriver driver) {
		return (driver.getTitle());
	}

	public String getXpathOfTable(String column1, String column1_value, String column2, WebDriver driver) {
		int i = 1, col, row;
	List<WebElement> columnnames = driver.findElements(By.xpath("//table/thead/tr/th"));
		Iterator<WebElement> itr1 = columnnames.iterator();
		while (itr1.hasNext()) {
			String header = itr1.next().getText();
			if (header.equalsIgnoreCase(column1)) {
				break;
			}
			++i;
		}
		col = i;
		String xpathval = "//table/tbody/tr/td[" + col + "]";
		i = 1;
		List<WebElement> colvalue = driver.findElements(By.xpath(xpathval));
		Iterator<WebElement> itr2 = colvalue.iterator();
		while (itr2.hasNext()) {
			String col1_val = itr2.next().getText();
			if (col1_val.equalsIgnoreCase(column1_value)) {
				break;
			}
			++i;
		}
		row = i;
		i = 1;
		List<WebElement> columnnames2 = driver.findElements(By.xpath("//table/thead/tr/th"));
		Iterator<WebElement> itr3 = columnnames2.iterator();
		while (itr2.hasNext()) {
			String col1_val = itr3.next().getText();
			if (col1_val.equalsIgnoreCase(column2)) {
				break;
			}
			++i;
		}
		col = i;
		xpathval = "//table/tbody/tr[" + row + "]/td[" + col + "]";
		return (xpathval);

	}

	public WebElement getWebElementOfTable(String col1, String col1_value, String col2, WebDriver driver) {
		String xpath = getXpathOfTable(col1, col1_value, col2, driver);
		return (driver.findElement(By.xpath(xpath)));
	}

	public boolean isElementPresentInColumn(String col1, String col1_value, WebDriver driver) {
		int i = 1, col;
		List<WebElement> colnames1 = driver.findElements(By.xpath("//table/thead/tr/th"));
		Iterator<WebElement> itr1 = colnames1.iterator();
		while (itr1.hasNext()) {
			String header = itr1.next().getText();
			if (header.equalsIgnoreCase(col1)) {
				break;
			}
			++i;
		}
		col = i;
		String xpathval = "//table/tbody/tr/td[" + col + "]";
		i = 1;
		List<WebElement> names = driver.findElements(By.xpath(xpathval));
		Iterator<WebElement> itr2 = names.iterator();
		while (itr2.hasNext()) {
			String col1_val = itr2.next().getText();
			if (col1_val.equalsIgnoreCase(col1_value)) {
				return true;
			}
			++i;
		}
		return false;
	}

	public int elementRowNoInColumn(String col1, String col1_value, WebDriver driver) {
		int i = 1, col, row;
		List<WebElement> colnames1 = driver.findElements(By.xpath("//table/thead/tr/th"));
		Iterator<WebElement> itr1 = colnames1.iterator();
		while (itr1.hasNext()) {
			String header = itr1.next().getText();
			if (header.equalsIgnoreCase(col1)) {
				break;
			}
			++i;
		}
		col = i;
		String xpathval = "//table/tbody/tr/td[" + col + "]";
		i = 1;
		List<WebElement> names = driver.findElements(By.xpath(xpathval));
		Iterator<WebElement> itr2 = names.iterator();
		while (itr2.hasNext()) {
			String col1_val = itr2.next().getText();
			if (col1_val.equalsIgnoreCase(col1_value)) {
				break;
			}
			++i;
		}

		row = i;
		return (row);
	}
	public WebElement getEditButtonXpath(String editedPageName,String newPageName,WebDriver driver) {
		String xpath=getXpathOfTable("Page",newPageName,"Action",driver);
		xpath=xpath+"/a[1]";
		return(driver.findElement(By.xpath(xpath)));
	}
	public WebElement getDeleteButtonXpath(String title,WebDriver driver) {
		String xpath=getXpathOfTable("Title",title,"Action",driver);
		xpath=xpath+"/a[2]";
		return(driver.findElement(By.xpath(xpath)));
	}
	public WebElement getPasswordButtonXpath(String user,WebDriver driver) {
		String xpath=getXpathOfTable("Username",user,"Password",driver);
		xpath=xpath+"/div/a";
		return(driver.findElement(By.xpath(xpath)));
	}
	public WebElement getActiveButtonXpath(String user,WebDriver driver) {
		String xpath=getXpathOfTable("UserName",user,"Status",driver);
			xpath=xpath+"/a";
			return(driver.findElement(By.xpath(xpath)));
		}
	}

