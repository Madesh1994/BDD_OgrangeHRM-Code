package com.HRM.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.HRM.base.BaseUtil;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks extends BaseUtil {
	private WebDriver driver;

	@Before
	public void test(Scenario scenario) {
		System.out.println("Hooks before tag");
	}

	@After
	public void tear(Scenario scenario) {
		System.out.println("Hooks after tag");
		System.out.println("Then : 5. Logged out successfully");
		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "jpge/png");
			} catch (Exception except) {
				except.printStackTrace();
			}
		}

		driver.quit();
	}
}
