package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "userName")
	private WebElement usernameTbx;
	
	@FindBy(id = "passWord")
	private WebElement passwordTbx;
	
	@FindBy(xpath = "//input[@type = 'checkbox' and @name = 'j_remember']")
	private WebElement rememberMeChkBox;
	
	@FindBy(xpath = "//input[@title = 'Sign In']")
	private WebElement signInButton;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Business Logic
	public void setLogin(String un, String pw) {
		usernameTbx.sendKeys(un);
		passwordTbx.sendKeys(pw);
		signInButton.click();
	}

}
