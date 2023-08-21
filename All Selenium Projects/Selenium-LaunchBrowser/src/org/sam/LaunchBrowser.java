package org.sam;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowswer {
	
	public static void main(String[] args) {
		// step1 browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\LaunchBrowser\\src\\drivers\\chromedriver.exe");
		
		//step2 Browser Launch
		WebDriver driver = new ChromeDriver();
		
		//Url
		driver.get("https://www.flipkart.com/");
		//manage
		driver.manage().window().maximize();
		//currenttitle
		String Pagetitle = driver.getTitle();
		System.out.println("Page Title:"+Pagetitle);
		//current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: "+currentUrl);
		
		//quit
		driver.quit();
	}

}
