package StepDefinations;

import org.openqa.selenium.WebDriver;

import ContextPico.TestContext;
import DriverFactory.DriverFactory;
import PageObjectModel.PageObjectFactory;
import PageObjectModel.ProductPage;
import io.cucumber.java.en.When;

public class ProductSteDef {
	WebDriver driver;
	ProductPage product ;
	public	ProductSteDef (TestContext testContext)
	{
		driver=testContext.driver;
		product = PageObjectFactory.getProductPage(driver);
		
	}
	@When("I add item in cart")
	public void i_add_blue_shoes_in_cart() {
		product.click_Add_to_cart();
	   
	   
	}

}
