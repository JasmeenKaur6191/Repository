package Template;

import org.openqa.selenium.WebDriver;

import TestDataSheet.ConfigDataProvider;

public class Browser {
	public static WebDriver specifyBrowser()

	{
		WebDriver driver;
		 driver = BrowserFactory.getBrowser("chrome");	
		 return  driver;
	}


}
