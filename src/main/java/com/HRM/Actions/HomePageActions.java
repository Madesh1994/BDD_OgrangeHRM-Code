package com.HRM.Actions;

import org.openqa.selenium.WebDriver;

import com.HRM.pageObject.HomePage;

public class HomePageActions extends HomePage {

	public HomePageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// method for getting user name
	public String linkWelcomemethod() {
		return linkWelcome.getText();
	}
	
	// method for getting user name
		public void linklogoutArrow() {
			linklogoutArrow.click();
		}

	
	// method for logout. 
	public void linkLogoutmethod() {
		linkLogout.click();
	}

}
