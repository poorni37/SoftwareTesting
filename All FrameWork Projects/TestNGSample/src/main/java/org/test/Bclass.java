package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Bclass extends BaseClass {
    
	
	@DataProvider(name="sample Data")// for bulk inputs
	private Object[][] data() {
		return new Object[][] {
			{"abc@gmai.com","132435"},
			{"nandhu@gmail.com","268275"},
			{"poorni@fnw","983782"},
            {"kavi@gmail.com","9293749257"}
		};}
    
	
	@Test (dataProvider="sample Data")
	private void tc15(String e, String p) {
		System.out.println("tc15");
		 driver.get("https://en-gb.facebook.com/");
	     WebElement email = driver.findElement(By.id("email"));
	       email.sendKeys(e);
	     WebElement pass = driver.findElement(By.name("pass"));
	     pass.sendKeys(p);
	       
        
	}
	
	@DataProvider(name="Amazon")
 public Object[][] datas() {
 return new Object[][] {
	 {"football"},{"apple"},{"shoe"} 
 };
}
	
	
	@Test(dataProvider = "Amazon")
	private void tc12(String s) throws AWTException {
		System.out.println("tc12");
       driver.get("https://www.amazon.com/");
       WebElement searchbtn = driver.findElement(By.id("twotabsearchtextbox"));
       searchbtn.sendKeys(s);
       Robot r = new Robot();
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
	}
}
