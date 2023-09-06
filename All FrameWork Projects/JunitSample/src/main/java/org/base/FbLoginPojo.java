package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.BaseClass;

public class FbLoginPojo extends BaseClass {

	// 1. nNon parameterized constructor
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);

	}

	// private webelement
	// WebElement email = driver.FindElement(by.xpath(" "));

	// example for Find all annotation same for findbys
//@FindAll({@FindBy(xpath="//input[@data-testid='royal_email"),@FindBy(xpath="//input[@name='email']"),@FindBy(xpath="//input[@id='email']")})
//private WebElement ref;
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement pass;

	@FindBy(name = "login")
	private WebElement lgnbtn;

	// Getters to access webelement outside class

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}

//	public WebElement getRef() {
//	return ref;}
}
