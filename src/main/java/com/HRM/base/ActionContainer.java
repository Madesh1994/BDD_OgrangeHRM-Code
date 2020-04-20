package com.HRM.base;

import org.openqa.selenium.WebDriver;
import com.HRM.Actions.HomePageActions;
import com.HRM.Actions.LoginActions;

public class ActionContainer extends BaseUtil {

	public WebDriver driver;

	// Constructor
	public ActionContainer(WebDriver driver) {
		createPageObject();
	}

	//Variables
	private LoginActions LoginActionBase;
	private HomePageActions HomePageActionsBase;

	public LoginActions getLoginActionsmethod() {
		return LoginActionBase;
	}

	public HomePageActions getHomePageActionsmethod() {
		return HomePageActionsBase;
	}

	// Method
	private void createPageObject() {
		LoginActionBase = new LoginActions(getWebDriver());
		HomePageActionsBase = new HomePageActions(getWebDriver());
	}

}