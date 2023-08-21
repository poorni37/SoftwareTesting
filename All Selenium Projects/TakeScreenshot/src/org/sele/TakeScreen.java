package org.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class TakeScreen {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Robot1\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot tk =(TakesScreenshot)driver;
		// use getscreenshotas
		File img = tk.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\TakeScreenshot\\src\\ScreenShot\\fblogin.png");
	    FileUtils.copyFile(img, f); 	
		

	}

}
