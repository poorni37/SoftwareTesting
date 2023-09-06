package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Aclass extends BaseClass {
	
	
	@Parameters({"username","pass"}) //for call the inputs in testng.xmlfile
	@Test
	private void tc112(@Optional("abc@gmail.com") String s,@Optional("1232435536") String p) { // if parameters have mismatch then we use @optional 
		System.out.println("tc112");
     driver.get("https://en-gb.facebook.com/");
     String pageTitle = pageTitle();
     WebElement email = driver.findElement(By.id("email"));
       email.sendKeys(s);
       // Hardassert
     Assert.assertTrue(pageTitle.contains("facebook"), "check your title");
     WebElement pass = driver.findElement(By.name("pass"));
     pass.sendKeys(p);
       
	}
	

	@Test(dataProvider = "Amazon", dataProviderClass = Bclass.class)// for outside call the data provider
	private void tc1(String data) throws AWTException {
	System.out.println("tc1");
       driver.get("https://www.amazon.com/");
       String title = pageTitle();
       WebElement searchbtn = driver.findElement(By.id("twotabsearchtextbox"));
       searchbtn.sendKeys(data);
       //Soft Assert
       SoftAssert s = new SoftAssert();
       s.assertTrue(title.contains("amazon"), "checkyour title");
       
       Robot r = new Robot();
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       
       s.assertAll();
	}

}
