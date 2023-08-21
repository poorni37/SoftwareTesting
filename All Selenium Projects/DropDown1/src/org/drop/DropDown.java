package org.drop;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\DropDown1\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement frt = driver.findElement(By.id("fruits"));
		Select s = new Select(frt);
		boolean multiple = s.isMultiple();
		System.out.println("Is mul=" + multiple);
		s.selectByIndex(0);
		s.selectByVisibleText("Orange");
		s.selectByValue("grape");

		List<WebElement> allselect = s.getAllSelectedOptions();
		for (int i = 0; i < allselect.size(); i++) {
			WebElement op = allselect.get(i);
			String text = op.getText();
			System.out.println(text);

		}
//     s.deselectByIndex(0);
		s.deselectAll();

	}

}
