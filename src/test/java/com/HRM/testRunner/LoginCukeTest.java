package com.HRM.testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(value = Cucumber.class) // default code like main method or WebDriver, it must.
@CucumberOptions(monochrome = true, features = "././resources/features/HRMLogin.feature", // Feature name and/or Feature
																							// File name
		glue = { "com.HRM.stepDefinitions" }, // #Step Definition package name
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json", "json:target/cucumber.xml",
				"rerun:target/return.txt" })

//report will generate automatically by cucumber. in which path this report will generate and which format

public class LoginCukeTest {

}
