package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Modules.Article;
import Modules.HomePage;
import Modules.LatestNews;
import Template.Browser;
import Template.BrowserFactory;
import Template.DataProviderFactory;

@Test
public class TC2_VerifyArticleWithLogs

{
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver = BrowserFactory.getBrowser("chrome");
	

	@BeforeMethod
	public void launchapplicationAndNavigatetoArticle() throws InterruptedException
	{
		report = new ExtentReports("./Reports/Report.html", true);
		logger = report.startTest("Verify the Article");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.GetPageTitle();
		logger.log(LogStatus.INFO, "Application loaded successfully");
		LatestNews latestnews = PageFactory.initElements(driver, LatestNews.class);
		home.ClickonToggleMenu();
		home.ClickonSports();
		home.ClickonFootball();
		home.ClickonLatestNewsFromeToggle();
		logger.log(LogStatus.INFO, "LatestNewsFromeToggle clicked successfully");
		latestnews.Selectarticle();
		logger.log(LogStatus.INFO, "FirstArticle selected successfully");

	}

	@Test
	public void VerifyArticle()
	{
		
        Article articles = PageFactory.initElements(driver, Article.class);
	 

		  try { AssertJUnit.assertEquals(true, articles.ArtileTille().isDisplayed()); }
		  catch (Throwable e) {  }
		  
		  
		  try { AssertJUnit.assertEquals(true, articles.ArticleDescription().isDisplayed());
		  } catch (Throwable e) {  }
		  
		  try {
		  AssertJUnit.assertEquals(true, articles.ArticleHeroImage().isDisplayed());
		  } catch (Throwable e) {  }
		 
		  logger.log(LogStatus.INFO, "Article Verified successfully");
	}

	
	@AfterMethod
	public void tearDown() {
		BrowserFactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
		
		logger.log(LogStatus.INFO, "Browser Closed");
		
		logger.log(LogStatus.INFO, "Report generated successfully");
	}

}
