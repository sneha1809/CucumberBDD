package commons;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import PageObjectModel.CartPage;

public class ConfigReader {
	private Properties properties = new Properties();
	private static ConfigReader configReader= new ConfigReader();
	//File file = new File ("src/test/resources/com/config/config.properties");
	
	public Properties loadConfig() throws IOException
	{
		FileInputStream ffs= new FileInputStream("src/main/java/commons/config.properties");
		properties.load(ffs);
		return properties;
		
	}
	private ConfigReader()
	{
		
	}
	
	public static ConfigReader getInstance()
	{
		return configReader==null ? new ConfigReader() : configReader;
		
	}
}
