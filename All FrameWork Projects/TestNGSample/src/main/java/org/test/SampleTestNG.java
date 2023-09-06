package org.test;
import org.base.BaseClass;
import org.sample.FbLoginPojo;
import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Date;
public class SampleTestNG extends BaseClass {

	@Test(enabled = false)// ignore
	private void tc1() {
		System.out.println("tc1");
		launchUrl("https://en-gb.facebook.com/");
		FbLoginPojo f = new FbLoginPojo();
		passText("poorni12ab", f.getEmail());
		passText("123435466", f.getPass());
		

	}
	@Test(invocationCount =2) //how many times it will execute
	private void tc15() {
		System.out.println("tc15");
		System.out.println(Thread.currentThread().getId());// to check current thread for parallel execution method
		launchUrl("https://www.snapdeal.com/");

	}
	@Test(priority = -2)
	private void tc12() {
		System.out.println("tc12");
		System.out.println(Thread.currentThread().getId());
		
       launchUrl("https://www.amazon.com/");
	}
	@Test(priority = 2)
	private void tc2() {
		System.out.println("tc2");
		System.out.println(Thread.currentThread().getId());
		launchUrl("https://www.amazon.com/");
	}
	
	@Test
	private void tc6() {
		System.out.println("tc6");
       launchUrl("https://www.amazon.com/");
	}
	
	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println("d");

	}
	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println("d");
	}
	
	@BeforeClass
	
	private void launchthebrowser() {
	   launchBrowser();
	   windowMaximize();
		

	}
	@AfterClass
	private void Closethebrowser() {
		closeEntireBrowser();
	}
}
