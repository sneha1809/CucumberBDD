package PageObjectModel;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderPage extends Base {
	By order_number= By.xpath("//li[@class='woocommerce-order-overview__order order']/strong");
OrderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



public String  get_order_number()
{
	return wait.until(ExpectedConditions.visibilityOfElementLocated(order_number)).getText();
	
}
}
