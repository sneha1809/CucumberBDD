package Hooks;

import org.openqa.selenium.WebDriver;

import ContextPico.TestContext;
import DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHook {
	TestContext testContext;

public CucumberHook(TestContext testContext) {
	this.testContext=testContext;
}
	
	
	@Before
	public void setup(Scenario scenario)
	{
		testContext.scenario=scenario;
		System.out.println(testContext.scenario.getName()+" : "+Thread.currentThread().getName());
		DriverFactory driverFactory = new DriverFactory();
		testContext.driver= driverFactory.initializeChromeDriver();		
		testContext.driver.get("https://askomdch.com/");	
		
	}

	@After
	public void tearDown()
	{
		testContext.driver.quit();
	}
}
