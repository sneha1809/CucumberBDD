package StepDefinations;

import org.openqa.selenium.WebDriver;

import ContextPico.TestContext;
import DriverFactory.DriverFactory;
import PageObjectModel.HomePage;
import PageObjectModel.PageObjectFactory;
import PageObjectModel.ProductPage;
import io.cucumber.java.en.When;

public class HomeStepDef {
	WebDriver driver;
	HomePage homePage ;
	public HomeStepDef (TestContext testContext)
	{
		driver=testContext.driver;
		homePage = PageObjectFactory.getHomePage(driver);
		
	}
	@When("I click first featured item in homepage")
	public void I_click_first_featured_item_in_homepage() {
		homePage.click_first_featured_element();
	   
	   
	}
	

}
