package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.base.SignInPojo;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegistration extends BaseClass {
	SignInPojo s;

	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch url of the fb application")
	public void to_launch_url_of_the_fb_application() {
		launchUrl(null);
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		s = new SignInPojo();
		clickbtn(s.getCreateacc());
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
       Thread.sleep(6000);
		List<String> list = d.asList();
        s = new SignInPojo();
		passText(list.get(2), s.getFirstnamebox());
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box(DataTable d) {
		Map<String, String> map = d.asMap(String.class, String.class);
		s = new SignInPojo();
		passText(map.get("firstname3"), s.getSecondnamebox());
	}

	

	@When("To pass mobilenoor email in email text box")
	public void to_pass_mobilenoor_email_in_email_text_box(DataTable d1) {
		List<List<String>> l = d1.asLists();
		s = new SignInPojo();
		passText(l.get(0).get(2), s.getMobileoremailbox());
	}

	@When("To create new pa/ssword using new password text box")
	public void to_create_new_password_using_new_password_text_box(DataTable d) {
		List<Map<String, String>> m1 = d.asMaps(String.class, String.class);
		
		s = new SignInPojo();
		passText(m1.get(1).get(2), s.getPasswordbox());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//closeEntireBrowser();
	}

}
