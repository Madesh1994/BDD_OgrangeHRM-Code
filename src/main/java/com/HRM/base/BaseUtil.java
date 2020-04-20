package com.HRM.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil extends EventFiringWebDriver {

	protected static WebDriver driver = null;

	// Constructor
	public BaseUtil() {
		super(driver);
	}

	static {
		if (driver == null) {
			try {
				webDriverMethod();
			} catch (Exception except) {
				except.printStackTrace();
			}
		}
	}

	// Getting WebDriver
	public WebDriver getWebDriver() {
		return BaseUtil.driver;
	}

	// Setting WebDriver

	// method for webdriver
	public static WebDriver webDriverMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("1. Window opened using Hooks.");
		return driver;
	}

	private static final Thread closeDriver = new Thread() {
		@Override
		public void run() {
			driver.quit();
		}
	};
}
