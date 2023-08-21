package org.sel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Alert\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		// Simple alert
		WebElement clickbtn = driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
		clickbtn.click();
		Alert a = driver.switchTo().alert();

		String txt = a.getText();
		System.out.println("Text=" + txt);
		a.accept();
		// Prompt alert
		WebElement alertwithtxt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertwithtxt.click();
		WebElement alertbtn = driver.findElement(By.xpath("//button[contains(text()='prompt')]"));

		alertbtn.click();
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("poorni");
		a1.accept();

	}

}
