package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage  extends Base{
	
	By storeLink = By.linkText("Store");
	By searchfield= By.id("woocommerce-product-search-field-0");
	By searchButton= By.xpath("//button[text()='Search']");

	public StorePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	public void  click_store_link()
	{
		wait.until(ExpectedConditions.elementToBeClickable(storeLink)).click();
		
	}
	
	public void  serach_items(String text)
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchfield)).sendKeys(text);
		click_search_Button();
		
	}
	
	public void  click_search_Button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		
	}
	
	

}
