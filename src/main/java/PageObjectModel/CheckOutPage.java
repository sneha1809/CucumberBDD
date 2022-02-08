package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import POJOs.Customer;

public class CheckOutPage  extends Base{
	By billing_first_name= By.name("billing_first_name");
	By billing_last_name= By.name("billing_last_name");
	By billing_address_1= By.name("billing_address_1");
	//By billing_address_2= By.name("billing_address_2");
	By billing_city= By.name("billing_city");
	By billing_postcode= By.name("billing_postcode");
	By billing_email= By.name("billing_email");
	By billing_country = By.id("billing_country");
	By select2_billing_country_container = By.xpath("//span[@id='select2-billing_country-container']/following-sibling::span");
	By billing_state = By.id("billing_state");
	
	By place_order= By.id("place_order");


	CheckOutPage(WebDriver driver) {
		super(driver);

	}
	public void fill_customer_data(Customer customer)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(billing_first_name)).sendKeys(customer.getFirstName());

		wait.until(ExpectedConditions.visibilityOfElementLocated(billing_last_name)).sendKeys(customer.getLastName());
		
		
		/*
		 * wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(
		 * billing_country, By.tagName("option")));
		 * driver.findElement(select2_billing_country_container).click(); Select select
		 * = new Select(driver.findElement(billing_country));
		 * select.selectByVisibleText(customer.getCountry()); select.selectByIndex(0);
		 */

		wait.until(ExpectedConditions.visibilityOfElementLocated(billing_address_1)).sendKeys(customer.getStreetAddress1());

		wait.until(ExpectedConditions.visibilityOfElementLocated(billing_city)).sendKeys(customer.getCity());	

		wait.until(ExpectedConditions.visibilityOfElementLocated(billing_postcode)).sendKeys(customer.getZipcode());

		wait.until(ExpectedConditions.visibilityOfElementLocated(billing_email)).sendKeys(customer.getEmail());

			

		Select select = new Select(driver.findElement(billing_state));
		select.selectByVisibleText(customer.getState1());

	}
	
	public void click_place_order()
	{
		try {
		wait.until(ExpectedConditions.presenceOfElementLocated(place_order)).click();
		}
		catch( StaleElementReferenceException s)
		{
			System.out.println("Attempting to recover from StaleElementReferenceException.......");
			place_order= By.id("place_order");
			wait.until(ExpectedConditions.presenceOfElementLocated(place_order)).click();			
			
		}
	}

	/*
	 * public void setBilling_first_name(String text) {
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(billing_first_name))
	 * .sendKeys(text); }
	 * 
	 * 
	 * public void setBilling_last_name(String text) {
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(billing_last_name)).
	 * sendKeys(text); }
	 * 
	 * 
	 * public void setBilling_address_1(String text) {
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(billing_address_1)).
	 * sendKeys(text); }
	 * 
	 * 
	 * public void setBilling_city(String city) {
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(billing_city)).
	 * sendKeys(city); }
	 * 
	 * 
	 * public void setBilling_postcode(String postcode) {
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(billing_postcode)).
	 * sendKeys(postcode); }
	 * 
	 * 
	 * public void setBilling_email(String email) {
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(billing_email)).
	 * sendKeys(email); }
	 * 
	 * 
	 * public void setBilling_country(String country) { Select select = new
	 * Select(driver.findElement(billing_country));
	 * 
	 * select.selectByValue(country); }
	 * 
	 * 
	 * public void setBilling_state(String state) {
	 * 
	 * Select select = new Select(driver.findElement(billing_state));
	 * select.selectByValue(state);
	 * 
	 * }
	 */




}
