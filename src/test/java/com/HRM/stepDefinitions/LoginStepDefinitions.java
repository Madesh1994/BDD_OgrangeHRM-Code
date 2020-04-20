package com.HRM.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.HRM.base.ActionContainer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

	private ActionContainer actioncontainer;

	// Constructor
	public LoginStepDefinitions(ActionContainer actioncontainer) {
		this.actioncontainer = actioncontainer;
	}

	@Given("I am open Orange HRM Application (.*)")
	public void loginMethod(String url) {
//		driver.get(url);
		actioncontainer.get(url);
		System.out.println("1. Open Chrome & Application");
	}

	@When("I enter vaild user name (.*)")
	public void vaildUsername(String username) {
//		WebElement textUsername = driver.findElement(By.id("txtUsername"));
		// textUsername.sendKeys(username);
		actioncontainer.getLoginActionsmethod().usernamemethod(username);
	}

	@When("I enter valid password (.*)")
	public void password(String password) {
		// WebElement textPassword = driver.findElement(By.id("txtPassword"));
		// textPassword.sendKeys(password);
		actioncontainer.getLoginActionsmethod().passwordmethod(password);

		// WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
		// buttonLogin.click();
		actioncontainer.getLoginActionsmethod().buttonLoginmethod();
		System.out.println("When: 2. Sign In");
	}

	@Then("I should logged into Orange HRM Application")
	public void loggedintoHRM() {
		System.out.println("Then : 3. Logged into HRM successfully");
	}

	@When("I click Logout button")
	public void clickLogoutLink() throws InterruptedException {
		// WebElement linkWelcome = driver.findElement(By.id("welcome"));
		// linkWelcome.click();
		actioncontainer.getHomePageActionsmethod().linkWelcomemethod();
		Thread.sleep(3000);
		
		// WebElement linkLogout =
		// driver.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"));
		// linkLogout.click();
		actioncontainer.getHomePageActionsmethod().linkLogoutmethod();
		System.out.println("When: 4. Sign Out");
	}

	@Then("I should logged out from the HRM Application")
	public void loggedOut() {
		System.out.println("Then : 5. Logged out successfully");
//		driver.quit();
	}

}