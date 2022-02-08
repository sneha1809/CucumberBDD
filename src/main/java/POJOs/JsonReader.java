package POJOs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import commons.ConfigReader;

public class JsonReader {
	
	
	
	public static Customer getCustomerDataObject() throws FileNotFoundException, IOException
	{
		InputStream input = new FileInputStream(ConfigReader.getInstance().loadConfig().getProperty("customerData"));
		ObjectMapper objectMapper = new ObjectMapper();		
		Customer customer = objectMapper.readValue(input, Customer.class);
		System.out.println(customer.toString());
		return customer;
		
	}

}
