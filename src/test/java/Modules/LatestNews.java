package Modules;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LatestNews {
	WebDriver driver;
	public LatestNews(WebDriver Idriver)
	{
		this.driver = Idriver;
	}
	
	@FindBy(className = "article-snippet__header-link")
	List<WebElement> article;
	
	
	public String Selectarticle() 
	
	 {	
		String selectingarticle = new String("$135m dilemma hiding in plain sight; 12-point collision we didn’t see coming: PL Set Piece");
		
try {
		for(int i=0; i <article.size(); i++) 
	      { 
			if(selectingarticle.contains(article.get(i).getText()))
			{
				article.get(i).click();
				break;
			}
	     }
}  catch (Throwable e) { }

		return selectingarticle;
		
		
		
	}
	
	
	
}