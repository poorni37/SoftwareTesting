package org.fra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\DropDown1\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
 JavascriptExecutor js = (JavascriptExecutor) driver;
 WebElement iframe = driver.findElement(By.xpath("//h3[contains(text(),'adBlock ')]"));
 
 js.executeScript("arguments[0].scrollIntoView()", iframe );
 
 //switch to iframe
 
driver.switchTo().frame("a077aa5e");

//or
//	WebElement frame = driver.findElement(By.name("a077aa5e"));
//	driver.switchTo().frame(frame);
	
	WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	img.click();
	
	//find all frames
	List<WebElement> elements = driver.findElements(By.tagName("iFrames"));
	int allframes = elements.size();
	System.out.println(allframes);
	
	
	}

}
