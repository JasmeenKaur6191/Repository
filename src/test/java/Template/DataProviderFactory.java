package Template;

import TestDataSheet.ConfigDataProvider;

public class DataProviderFactory 
{
	
	public static ConfigDataProvider getConfig()

	{
		ConfigDataProvider config= new ConfigDataProvider();
		return config;
	}
}
