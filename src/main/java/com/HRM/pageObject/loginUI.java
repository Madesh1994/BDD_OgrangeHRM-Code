package com.HRM.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginUI {

	public WebDriver driver;
	
	public loginUI(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		//Finding User Name text box
	@FindBy(how = How.ID, using = "txtUsername")
protected WebElement textUsername;
		
		//Finding Password Text box
	@FindBy(how = How.ID, using = "txtPassword")
protected	WebElement textPassword;
		
		//Clicking on Login Button
	@FindBy(how = How.ID, using = "btnLogin")
protected	WebElement buttonLogin;
		
	}