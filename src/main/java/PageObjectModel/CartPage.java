package PageObjectModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage  extends Base{
	String cart_table_rows_xpath="//table[starts-with(@class,'shop_table shop_table_responsive')]/tbody/tr";
	By proceed_to_checkout=By.xpath("//div[@class='wc-proceed-to-checkout']//a");
	private By cart_table_rows= By.xpath(cart_table_rows_xpath);

	CartPage(WebDriver driver) {
		super(driver);		
	}

	public void  click_proceed_to_checkout_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(proceed_to_checkout)).click();

	}
	
	
	public Map<String , String> get_product_name_and_quantity_from_cart()
	{
		Map<String , String> products_in_cart= new HashMap<String , String>();
		String product_name = null,product_quantity = null;

		List<WebElement>rows= get_number_of_rows_in_cart();

		for(WebElement row: rows)
		{
			List<WebElement> cells= row.findElements(By.tagName("td"));
			for(WebElement cell : cells)
			{
				if(cell.getAttribute("class").equals("product-name"))
				{
					product_name= cell.getText();
					System.out.println("product-name "+product_name);
				}

				if(cell.getAttribute("class").equals("product-quantity"))
				{
					product_quantity= cell.findElement(By.tagName("input")).getAttribute("value");
					System.out.println("product_quantity "+product_quantity);
				}
			}
			products_in_cart.put(product_name, product_quantity);
		}

		return products_in_cart;  	    

	}
	

	public List<WebElement> get_number_of_rows_in_cart()
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(cart_table_rows));
		List<WebElement>rows= driver.findElements(cart_table_rows);
		return rows;

	}
}
