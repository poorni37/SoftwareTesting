package org.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoRegister {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\AutomationRegis\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name'] "));
		firstname.sendKeys("Poornima");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("P");
		WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("Madurai");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("1234@gmail.com");
		WebElement phno = driver.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("123455");
		WebElement rdb = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		rdb.click();
		WebElement hobbiebtn = driver.findElement(By.id("checkbox3"));
		hobbiebtn.click();
		WebElement lan = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
		lan.click();
		WebElement eng = driver.findElement(By.xpath("//a[text()='English']"));
		eng.click();
		
						
						
	}

}
