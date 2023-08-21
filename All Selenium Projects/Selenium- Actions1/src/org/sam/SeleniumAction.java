package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class SeleniumAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Actions1\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement amt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement creditside = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		a.dragAndDrop(amt, creditside).perform();
		WebElement debitsideacc = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(amt, debitsideacc).perform();

	}

}
