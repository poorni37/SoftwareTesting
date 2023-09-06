package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass{

	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		windowMaximize();
		
		FbLoginPojo f = new FbLoginPojo();
	    passText("pooorni", f.getEmail());
	    passText("123435", f.getPass());
       
	    
	    driver.navigate().refresh();
	    passText("poorni12ab", f.getEmail());
	    passText("98765453", f.getPass());
	    
		
		
		// without page factory
		
//		WebElement email = driver.findElement(By.id("email"));
//		passText("poorni12ab", email);
//		
//		WebElement pass = driver.findElement(By.name("pass"));
//		pass.sendKeys("password");
//		
//		// to refresh page 
//		
//		driver.navigate().refresh();
//        
//		passText("poorni", email);
//		passText("1234", pass);
//		
	}

}
