package StepDefinations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import ContextPico.TestContext;
import DriverFactory.DriverFactory;
import POJOs.Customer;
import POJOs.JsonReader;
import PageObjectModel.CartPage;
import PageObjectModel.CheckOutPage;
import PageObjectModel.HomePage;
import PageObjectModel.PageObjectFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDef {
	WebDriver driver;
	CartPage cart ;
	CheckOutPage checkOut;
	Customer customer;
	TestContext testContext;
	
	public	CheckoutStepDef (TestContext testContext)
	{
		this.testContext=testContext;
		driver=testContext.driver;
		cart = PageObjectFactory.getCartPage(driver);
		checkOut= PageObjectFactory.getCheckoutPage(driver);
		
	}
	@When("I proceed to checkout and fill billing details")
	public void i_proceed_to_checkout_and_fill_billing_details() throws FileNotFoundException, IOException {
	    
		cart.click_proceed_to_checkout_button();
		customer=JsonReader.getCustomerDataObject();
		checkOut.fill_customer_data(customer);	
		
		
	}

	@When("I place order")
	public void i_place_order() throws InterruptedException {
		//Thread.sleep(5000);
		checkOut.click_place_order();
	}

	

}
