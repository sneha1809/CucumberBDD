package PageObjectModel;

import org.openqa.selenium.WebDriver;

public class PageObjectFactory {
	private static CartPage cart;
	private static ProductPage product;
	private static StorePage store;
	private static HomePage home;
	private static CheckOutPage checkout;
	private static OrderPage order;
	
	public static CartPage  getCartPage(WebDriver driver)
	{
		return cart==null ? new CartPage(driver) : cart;
		
	}
	
	public static ProductPage getProductPage(WebDriver driver)
	{
		return product==null? new ProductPage(driver): product;
		
	}
	
	public static StorePage getStorePage(WebDriver driver)
	{
		return store==null ? new StorePage(driver): store;
		
	}
	
	public static HomePage getHomePage(WebDriver driver)
	{
		return home ==null ? new HomePage(driver): home;
		
	}
	
	public static CheckOutPage getCheckoutPage(WebDriver driver)
	{
		return checkout ==null ? new CheckOutPage(driver): checkout;
		
	}
	
	public static OrderPage getOrderPage(WebDriver driver)
	{
		return order ==null ? new OrderPage(driver): order;
		
	}
	

}
