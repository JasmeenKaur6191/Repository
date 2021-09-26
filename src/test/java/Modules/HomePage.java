package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver Idriver) 
	{
		this.driver= Idriver;
	}
	
	@FindBy(className="fiso-navigation-contextual__nav-link") WebElement videolinkathomepage ;
	@FindBy(xpath = "//label[contains(@aria-label,'Toggle menu open and closed')]") WebElement togglemenu;
	@FindBy(xpath= "//label[@aria-label='Open Sports submenu']") WebElement Sports ;
	@FindBy(xpath= "//label[@aria-label='Open Football submenu']") WebElement Football ;;
	@FindBy(xpath = "(//a[@href='/football/latest-news'])") WebElement latestNews ;
	
	
	public void VideoLinkatHomePage() throws InterruptedException 
	{
		boolean b = true;
		for(int i=0;i<10;i++)
		{
			if(b==videolinkathomepage.isDisplayed())
			{
					break;
	
			}
			Thread.sleep(1000);
		}
			
			videolinkathomepage.click();
		
	}
	
	public void ClickonToggleMenu()
	{
		boolean b = true;
	     for(int i=0;i<10;i++)
	{
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b==togglemenu.isDisplayed())
		{
				break;

		}
	}
		
	togglemenu.click();
	
	}
	
	public void ClickonSports() throws InterruptedException
	{  	
		 boolean b = true;
	      for(int i=0;i<10;i++)
	      {
	      Thread.sleep(100);
	      if(b==Sports.isDisplayed())
				break;
		  }	
		Sports.click();
	}
	public void ClickonFootball() throws InterruptedException
	{
		 boolean b = true;
	      for(int i=0;i<10;i++)
	      {
	      Thread.sleep(100);
	      if(b==Football.isDisplayed())
				break;
	      }
		Football.click();
	}
	
	
	public String GetPageTitle()
	{
		return driver.getTitle();
	}

	public void ClickonLatestNewsFromeToggle() throws InterruptedException
	{ boolean b = true;
    for(int i=0;i<10;i++)
    {
    Thread.sleep(100);
    if(b==latestNews.isDisplayed())
			break;
    }
		latestNews.click();
		
	}
}

