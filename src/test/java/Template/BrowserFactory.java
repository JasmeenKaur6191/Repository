package Template;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import TestDataSheet.ConfigDataProvider;



public class BrowserFactory {
	static WebDriver driver;
	
	
	public static WebDriver getBrowser(String Browser) 
	{
		if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.bin", DataProviderFactory.getConfig().getSafariPath());
		     driver = new FirefoxDriver();
		}
		else if (Browser.equalsIgnoreCase("chrome"))	
		{ 
			System.getProperty("WebDriver.chrome.driver", DataProviderFactory.getConfig().getChromePath() );
			driver= new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("IE"))
		{		
			System.setProperty("WebDriver.InternetExplorer.driver", DataProviderFactory.getConfig().getIEPath() );
			driver= new InternetExplorerDriver();
			
		}
		else if (Browser.equalsIgnoreCase("Safari"))
		{	
			System.setProperty("WebDriver.Safari.driver", DataProviderFactory.getConfig().getSafariPath() );
			driver= new SafariDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;		
	}
	
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	

}
