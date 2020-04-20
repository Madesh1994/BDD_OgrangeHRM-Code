package com.HRM.Actions;

import org.openqa.selenium.WebDriver;

import com.HRM.pageObject.loginUI;

public class LoginActions extends loginUI {

	public LoginActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// method for getting user name
	public void usernamemethod(String username) {
		textUsername.sendKeys(username);
	}

	// method for getting password
	public void passwordmethod(String password) {
		textPassword.sendKeys(password);
	}

	// method for click login button
	public void buttonLoginmethod() {
		buttonLogin.click();
	}
}
