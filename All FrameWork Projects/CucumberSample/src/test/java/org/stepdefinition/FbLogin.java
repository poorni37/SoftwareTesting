package org.stepdefinition;

import org.base.BaseClass;
import org.base.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {

	 FbLoginPojo f;
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		launchUrl("https://en-gb.facebook.com");
	} 

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String emai) {
	    f = new FbLoginPojo();
	    passText(emai, f.getEmail());
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		f = new FbLoginPojo();
		passText(pass, f.getPass());
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		f = new FbLoginPojo();
		clickbtn(f.getLgnbtn());
		}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	  closeEntireBrowser();
	}


}
