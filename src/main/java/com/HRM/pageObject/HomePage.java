package com.HRM.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Finding User name text
	@FindBy (how = How.ID, using = "welcome")
	protected WebElement linkWelcome;

	
	//Finding logout arrow
	@FindBy (how=How.XPATH, using ="//a[@class='panelTrigger activated-welcome']")
	protected WebElement linklogoutArrow;
	// finding logout link
	
	@FindBy (how = How.XPATH, using = "//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]")
	protected WebElement linkLogout;

}
