package TestDataSheet;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	static Properties pro;

	public ConfigDataProvider()
	{
		File src = new File("./Configuration/config.properties");
		
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro =new Properties();		
			pro.load(fis);	
			
		}catch (Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	public  String getChromePath()
	{
		String chrome = pro.getProperty("chromePath");
		return chrome;
	}
	public  String getIEPath()
	{
		String IE = pro.getProperty("IEPath");
		return IE;
	}
	public  String getSafariPath()
	{
		String Safari = pro.getProperty("SafariPath");
		return Safari;
	}
	public  String getfirefoxPath()
	{
		String firefoxPath = pro.getProperty("firefoxPath");
		return firefoxPath;
	}
	public  String getApplicationUrl()
	{
		String url= pro.getProperty("url");
		return url;
	}
	public  String BrowserUnderTest()
	{
		String browser= pro.getProperty("BrowserUnderTest");
		return browser;
	}
}
