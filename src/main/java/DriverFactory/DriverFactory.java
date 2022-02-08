package DriverFactory;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	//private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>(); 
	private WebDriver driver;
	 
	public  WebDriver   initializeChromeDriver()
	{
		WebDriverManager.chromedriver().setup();
	//	tldriver.set(new ChromeDriver());
		 driver = new ChromeDriver();
		 manageBrowser();
		 manageImplicitTimeouts();
		 return driver;
		
	}
	
	/*
	 * public static synchronized WebDriver getDriver() { return tldriver.get(); }
	 */
	
	public  void manageBrowser()
	{
		/*
		 * getDriver().manage().window().maximize();
		 * getDriver().manage().deleteAllCookies();
		 */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	  public  void manageImplicitTimeouts() {
	//  getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);}
	 

}
