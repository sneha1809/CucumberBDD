package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebdriverUtils {
	
	public void findByID(WebDriver driver ,String ID)
	{
		driver.findElement(By.id(ID));
		
	}
	public void findByName(WebDriver driver ,String name)
	{
		driver.findElement(By.name(name));
		
	}
	public void findByXpath(WebDriver driver ,String xpath)
	{
		driver.findElement(By.xpath(xpath));
		
	}
	public void findBycss(WebDriver driver ,String css)
	{
		driver.findElement(By.cssSelector(css));
		
	}
	public void findBylinkText(WebDriver driver ,String linkText)
	{
		driver.findElement(By.linkText(linkText));
		
	}
	public void findBypartialLinkText(WebDriver driver ,String partialLinkText)
	{
		driver.findElement(By.partialLinkText(partialLinkText));
		
	}

}
