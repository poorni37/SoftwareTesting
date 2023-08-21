package org.win;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\WindowHandling\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone 14");

		WebElement srhbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		srhbtn.click();

		WebElement iphone = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		iphone.click();

		WebElement addtocart = driver
				.findElement(By.xpath("//input[@aria-labelledby='mbc-buybutton-addtocart-1-announce']"));
		addtocart.click();

		String parentid = driver.getWindowHandle();
		System.out.println("parentid=" + parentid);

		Set<String> allwinid = driver.getWindowHandles();
		System.out.println("allwinid=" + allwinid);
		// To Switch Window

//		for (String winid : allwinid) {
//			if ( winid != parentid) {
//				
//				driver.switchTo().window(winid);
//			}
//			
//		}

	}

}
