package StepDefinations;

import org.openqa.selenium.WebDriver;

import ContextPico.TestContext;
import DriverFactory.DriverFactory;
import PageObjectModel.OrderPage;
import PageObjectModel.PageObjectFactory;
import io.cucumber.java.en.Then;

public class OrderStepDef {
	WebDriver driver;
	OrderPage order ;
	public OrderStepDef (TestContext testContext)
	{
		driver=testContext.driver;
		order = PageObjectFactory.getOrderPage(driver);
		
	}
	@Then("I should see order details")
	public void i_should_see_order_details() {
		String order_number=order.get_order_number();
		order_number.matches("[0-9]");
		System.out.println("Order number----"+order_number);
	    
	}

}
