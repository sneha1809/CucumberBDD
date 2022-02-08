package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ContextPico.TestContext;
import DriverFactory.DriverFactory;
import PageObjectModel.CartPage;
import PageObjectModel.PageObjectFactory;
import PageObjectModel.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreStepDef {
	WebDriver driver;
	StorePage store;
	public	StoreStepDef (TestContext testContext)
	{
		driver=testContext.driver;
		store= PageObjectFactory.getStorePage(driver);
		
	}
	
	@Given("I am in the store page")
	public void i_am_in_the_store_page() {
		store.click_store_link();
	   
	}
	
	@And("I search for blue shoes")
	public void I_search_for_blue_shoes() {
		store.serach_items("blue shoes");	    
	   
	}
	
	@When("I search for {string}")
	public void i_search_for(String item) {
		store.serach_items(item);
	}
	

}
