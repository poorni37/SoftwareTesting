package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\LaunchBrowser\\src\\drivers\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://en-gb.facebook.com/");
        
        driver.manage().window().maximize();
        // to find email webelement
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("poorni12ab@gmail.com");
        //to find password webelement
        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys("1234555656");      
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        
        
        
        
				
	}

}
