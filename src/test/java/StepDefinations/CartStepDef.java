package StepDefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ContextPico.TestContext;
import DriverFactory.DriverFactory;

import PageObjectModel.CartPage;
import PageObjectModel.PageObjectFactory;
import io.cucumber.java.en.Then;



public class CartStepDef {
	//TestContext testContext;
	CartPage cart;WebDriver driver;
	
	public CartStepDef (TestContext testContext)
	{
		driver=testContext.driver;
		cart = PageObjectFactory.getCartPage(driver);
		
	}
	//WebDriver driver= testContext.
	//CartPage cart = PageObjectFactory.getCartPage(driver);
	
	@Then("I should see items in the cart")
	public void i_should_see_blue_shoes_in_the_cart() {
	  Map<String, String> map=cart.get_product_name_and_quantity_from_cart(); 
	 Assert.assertEquals(1, map.size());
	 Assert.assertTrue(map.containsKey("Blue Shoes"));
	 Assert.assertEquals("1",map.get("Blue Shoes"));
	}
	
	@Then("I should see {string} in the cart")
	public void i_should_see_in_the_cart(String item) {
		 Map<String, String> map=cart.get_product_name_and_quantity_from_cart(); 
		 Assert.assertEquals(1, map.size());
		 Assert.assertTrue(map.containsKey(item));
		 Assert.assertEquals("1",map.get(item));
	}
}
