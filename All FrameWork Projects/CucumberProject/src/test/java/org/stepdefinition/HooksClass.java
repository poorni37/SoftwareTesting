package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
 @Before(order = 1)
 //Precondition
 private void precondition() {
	launchBrowser();
	
}
 @Before(order = 2)
 private void precondition1() {
		
	 
		windowMaximize();
	}
 @Before(order=3 ,value="@Sanity")
 private void precondition2() {
		System.out.println("Window was closed");
	}
 @After(order=10)
 //postcondition
 private void Postcondition() {
	closeEntireBrowser();
}
	@After(order=2 , value="@Regression")
	 private void Postcondition2() {
		System.out.println("Browser was closed");
	}	
	
}
