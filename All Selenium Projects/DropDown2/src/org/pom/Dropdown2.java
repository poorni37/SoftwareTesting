package org.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\ELCOT\\eclipse-workspace\\DropDown2\\src\\drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://en-gb.facebook.com/");
//		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\DropDown1\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
		String text = element.getText();	
	System.out.println(text);
		}
		
		

	}

}
