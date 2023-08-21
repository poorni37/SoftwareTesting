package org.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class BrowserAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Robot1\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		// object for javascript excuter
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','poorni12ab@gmail.com')", email);
		Object script = js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println("value=" + script);
		Thread.sleep(3000);
		WebElement pss = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','1234556')", pss);
		WebElement lgn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", lgn);
		// js.executeScript("arguments[0].scrollIntoView(true)", iframe);

	}

}
