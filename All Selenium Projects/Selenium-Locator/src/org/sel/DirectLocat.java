package org.sel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DirectLocat {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\DirectLocator\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		// for texts
		WebElement Text = driver.findElement(By.xpath("//h2[contains(text(),'you connect')]"));
		 String fbtext = Text.getText();
		System.out.println(fbtext);
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
		Thread.sleep(3000);
		
		WebElement rdb = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		rdb.click();
	
		
	}

}
