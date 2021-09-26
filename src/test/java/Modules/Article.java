package Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Article 
{

	WebDriver driver;
	

	public Article(WebDriver Idriver) 
	{
		this.driver = Idriver;
	}

	@FindBy(xpath = "//h1[@class='sc-1v9vnhx-1 kNXfJu']")
	WebElement newstitle;
	By bynewstitle = By.xpath("//h1[@class='sc-1v9vnhx-1 kNXfJu']");
	
	@FindBy(xpath= "//img[contains(@attribution,'test')]")
	WebElement Articleimage;
	
	By byArticleimage = By.xpath("//img[contains(@attribution,'test')]");
	
	@FindBy(xpath= "//p[1]")
	WebElement articledescription ;
	
	By byarticledescription = By.xpath("//p[1]");
	

	public WebElement ArtileTille() 
{   WebDriverWait wait =new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(bynewstitle));
	//System.out.print("ArtileTille"+ newstitle.getText());
	return newstitle; 
}

	public WebElement ArticleDescription() 
	
	{
		WebDriverWait wait =new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.presenceOfElementLocated(byarticledescription));
		//System.out.print(articledescription.getText());
		return articledescription; 
			
	}

	public WebElement ArticleHeroImage()
	{   WebDriverWait wait =new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.presenceOfElementLocated(byArticleimage));
		//System.out.print("Value of DataHero"+Articleimage.getAttribute("data-hero"));
			return Articleimage;
	}
	

}
