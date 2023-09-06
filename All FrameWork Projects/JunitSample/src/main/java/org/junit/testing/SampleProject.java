package org.junit.testing;
import org.base.BaseClass;
import org.junit.Test;
import org.sample.FbLoginPojo;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.After;
import java.util.Date;
import org.junit.Before;
public class SampleProject extends BaseClass {
	
	@BeforeClass
	public static void launchtheBrowser() {
	 launchBrowser();
	 windowMaximize();

	}
	
	@AfterClass
	
     public static void closeTheBrowser() {
//		closeEntireBrowser();

	}
	
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@After
	  
	public void endDate() {
		Date d = new Date();
		System.out.println(d);

	}
	
	
	@Test
	 public void tc1() {
		System.out.println("Tc1");
		launchUrl("https://en-gb.facebook.com/");
		FbLoginPojo f = new FbLoginPojo();
        passText("poorni12", f.getEmail());
        Assert.assertTrue(false); //remaining does not execute
        passText("12344566", f.getPass());
	}
	
	@Test
	 public void tc2() {
		System.out.println("Tc2");
		launchUrl("https://www.snapdeal.com/");
		FbLoginPojo f = new FbLoginPojo();
		String pageTitle = pageTitle();
		String pageUrl = pageUrl();
	    passText("poorni12", f.getEmail());
        Assert.assertTrue("check your page title", pageTitle.contains("snapdeal")); //if fails msg will be shown
        //msg,exp,actual
        Assert.assertEquals("Check the Url", pageUrl, pageUrl.contains("snapdeal"));
        passText("12344566", f.getPass());

	}
	@Ignore
	@Test
	 public void tc3() {
		System.out.println("Tc3");
		launchUrl("https://www.myntra.com/");

	}
	
}
