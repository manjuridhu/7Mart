package com.obsequra.testscripts;
import java.io.IOException;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.obsequra.utilties.*;
public class ExcelUtilityChecking {
	
  @Test
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
}








