package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base {

	By firstFeaturedItem= By.xpath("//div[contains(@class,'wp-block-group__inner-container')]//li[1]//img");
	HomePage(WebDriver driver) {
		super(driver);		
	}
	
	public void click_first_featured_element()
	{
		wait.until(ExpectedConditions.elementToBeClickable(firstFeaturedItem)).click();
	}

}
