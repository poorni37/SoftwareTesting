package org.in;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumRobotcls {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Robot2\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();

		WebElement email = driver.findElement(By.id("email"));
		a.keyDown(Keys.SHIFT).sendKeys(email, "poorni12ab@gmail.com").keyUp(Keys.SHIFT);
		

	}

}
