package org.stepdefinition;

import org.base.BaseClass;
import org.base.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegativeFb extends BaseClass {
	 FbLoginPojo f;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		   windowMaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		f = new FbLoginPojo();
	    passText("poorni2", f.getEmail());
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		f = new FbLoginPojo();
		passText("12324", f.getPass());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbLoginPojo();
		clickbtn(f.getLgnbtn());
	}

	@When("To check whether navigate to homepage or not")
	public void to_check_whether_navigate_to_homepage_or_not() {
	   System.out.println("To check whether navigate to homepage");
	}

	@Then("To Close the browser")
	public void to_Close_the_browser() {
		closeEntireBrowser();
	}
}
