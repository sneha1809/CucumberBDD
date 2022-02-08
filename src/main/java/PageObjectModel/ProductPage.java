package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends Base {
	
	private By addToCart = By.xpath("//button[text()='Add to cart']");	
	private By viewCart= By.xpath("//a[text()='View cart']");
	
	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void click_Add_to_cart()
	{		
		wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart)).click();
		click_view_cart();
		
	}
	
	public void click_view_cart()
	{
		
	  wait.until(ExpectedConditions.visibilityOfElementLocated(viewCart)).click();; 
		
	}

}
