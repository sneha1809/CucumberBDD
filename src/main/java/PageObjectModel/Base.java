package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	protected WebDriver driver;
	protected WebDriverWait wait;
	Base(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver, 3);
	}

	public void load_url(String url)
	{
		driver.get(url);

	}

}
