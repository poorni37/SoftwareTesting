package org.tem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossTesting {
	
	@Parameters("Browser")
	
	@Test(retryAnalyzer = Failed.class) // to rerun the failed test cases 
	private void tc1(String browsername) {
	   WebDriver driver;
		if (browsername.equals("ChromeBrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browsername.equals("FireFoxBrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	
	}

}
