package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass {
	public SignInPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement Createacc;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstnamebox;

	@FindBy(name = "Lastname")
	private WebElement secondnamebox;

	@FindBy(name = "reg_email__")
	private WebElement mobileoremailbox;

	@FindBy(name = "reg_password")
	private WebElement passwordbox;

	public WebElement getCreateacc() {
		return Createacc;
	}

	public WebElement getFirstnamebox() {
		return firstnamebox;
	}

	public WebElement getSecondnamebox() {
		return secondnamebox;
	}

	public WebElement getMobileoremailbox() {
		return mobileoremailbox;
	}

	public WebElement getPasswordbox() {
		return passwordbox;
	}

}
